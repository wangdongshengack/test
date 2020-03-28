package com.wds.xiancheng;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Tickets tickets = new Tickets();
        FutureTask<Integer> fu = new FutureTask<Integer>(tickets);
        Thread t1 = new Thread(fu,"thread-1");
        t1.start();
        System.out.println(fu.get());
    }


    static class Tickets implements Callable<Integer> {
        //重写call方法，有返回值
        @Override
        public Integer call() throws Exception {
            int num=0;
             for (int i=0 ;i<100; i++){
                num+=i;
              }
            System.out.println("I an Callable thread : "+Thread.currentThread().getName());
            return num;
        }
    }
}
