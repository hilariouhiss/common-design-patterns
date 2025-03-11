package me.lhy.creational.singleton.lazy;

public class Main {
    public static void main(String[] args) {
        Lazy instance = Lazy.getInstance();

        System.out.println(instance);
    }
}
