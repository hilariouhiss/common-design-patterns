package me.lhy.creational.singleton.hungry;

public class Main {
    public static void main(String[] args) {
        Hungry instance = Hungry.getInstance();

        System.out.println(instance);
    }
}