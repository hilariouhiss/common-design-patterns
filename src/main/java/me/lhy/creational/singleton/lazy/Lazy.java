package me.lhy.creational.singleton.lazy;

/**
 * 双重检查锁
 */
public class Lazy {

    private static volatile Lazy instance;

    // volatile 防止指令重排，避免半初始化
    private Lazy() {
    }

    public static Lazy getInstance() {
        if (instance == null) {
            // 缩小加锁范围，减少锁竞争
            synchronized (Lazy.class) {
                // 确保当前无实例存在
                if (instance == null) {
                    instance = new Lazy();
                }
            }
        }
        return instance;
    }

}
