package com.wds.线程安全性比较.update_test;

import java.util.concurrent.ConcurrentHashMap;

public class MyTask2 implements Runnable{
    public static  final  String KEY="key";
    private ConcurrentHashMap<String,Integer> map;

    public  MyTask2(ConcurrentHashMap<String,Integer> map){
        this.map=map;
    }


    @Override
    public void run() {
        for (int i=0 ;i<100; i++){
            //我们用synchronized进行上锁，这个时候使用ConcurrentHashMap意义不大，可以换成不同集合或者对象。
            synchronized (map){
                this.addup();
            }
        }
    }

    private  void addup(){
        //判断是否包含指定的键名
        if(!map.containsKey(KEY)){
            map.put(KEY,1);
        }else{
            map.put(KEY,map.get(KEY) + 1);
        }
    }

}
