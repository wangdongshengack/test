package com.wds.线程安全性比较;

import java.util.concurrent.*;

public class demo1 {


    /*这个时候concurrentHashMap是线程不安全的。
    * ConcurrentHashMap的线程安全指的是，它的每个方法单独调用（即原子操作）
    * 都是线程安全的，但是代码总体的互斥性并不受控制。
    *   我们的最后一步包含了三个操作 mao.get() 加1 map.put()
    * */

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
             poll.execute(new MyTask(map));
          }

         poll.shutdown();
         poll.awaitTermination(1,TimeUnit.DAYS);


        return map.get(MyTask.KEY);

    }
}
