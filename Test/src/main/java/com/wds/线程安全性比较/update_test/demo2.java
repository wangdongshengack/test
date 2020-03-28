package com.wds.线程安全性比较.update_test;

import com.wds.线程安全性比较.MyTask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.*;

public class demo2 {

    public static void main(String[] args) throws InterruptedException {
        for (int i=0 ;i<10; i++){
            System.out.println(Test());
        }



    }


    private  static  int  Test() throws InterruptedException {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        ExecutorService poll=new ThreadPoolExecutor(20, 25,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(100));

        for (int i=0 ;i<8; i++){
            poll.execute(new MyTask2(map));
        }

        poll.shutdown();
        poll.awaitTermination(1,TimeUnit.DAYS);


        return map.get(MyTask.KEY);

    }
}
