package com.wds.DesignMode.单例设计模式;

public class Singleton2 {
    //饿汉式
    private  static Singleton2 singleton2=new Singleton2();

    private Singleton2(){
    }

    public  static Singleton2 getInstance(){
        return singleton2;
    }
}
