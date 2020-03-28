package com.wds.DesignMode.单例设计模式;

public class TestSingleton {
    public static void main(String[] args) {
       /* Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();*/

        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        System.out.println(s1==s2);
    }
}
