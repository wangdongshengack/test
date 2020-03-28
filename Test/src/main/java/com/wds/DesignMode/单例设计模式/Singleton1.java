package com.wds.DesignMode.单例设计模式;

public class Singleton1 {
    /*在内部创建一个实例，构造器全部设置为private，所有方法均在该实例上改动，在创建上要注意类的实例化只能执行一次，
    可以采用许多种方法来实现，如Synchronized关键字，或者利用内部类等机制来实现*/

    //懒汉式（创建对象需要别人给创建） :私有化构造方法，给外界提供一个公共的方法来获取当前类的实例
    private static Singleton1 singleton1=null;

    //私有化对象
    private Singleton1(){
    }

    //创建公共方法获取锁对象
   /* public synchronized static Singleton1 getInstance(){
        if(singleton1==null){
            singleton1=new Singleton1();
        }
        return singleton1;
    }*/

   //双重锁验证
   public synchronized static Singleton1 getInstance(){
       if(singleton1==null){
           synchronized (Singleton1.class){
               if(singleton1==null){
                   singleton1=new Singleton1();
               }
           }
       }
       return singleton1;
   }

}
