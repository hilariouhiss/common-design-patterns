package me.lhy.creational.singleton.hungry;

/**
 * 饿汉式
 * 线程安全
 * 类加载即创建实例，可能浪费系统资源
 */
public class Hungry {
    private static final Hungry INSTANCE = new Hungry();

    private Hungry() {
    }

    public static Hungry getInstance() {
        return INSTANCE;
    }
}
