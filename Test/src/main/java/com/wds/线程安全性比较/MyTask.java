package com.wds.线程安全性比较;

import java.util.concurrent.ConcurrentHashMap;

public class MyTask implements Runnable{
    public static  final  String KEY="key";
    private ConcurrentHashMap<String,Integer> map;

    public  MyTask(ConcurrentHashMap<String,Integer> map){
        this.map=map;
    }


    @Override
    public void run() {
         for (int i=0 ;i<100; i++){
                this.addup();
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
