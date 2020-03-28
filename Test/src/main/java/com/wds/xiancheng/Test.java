package com.wds.xiancheng;

public class Test {
    public static void main(String[] args) {
       RunnableTest ru = new RunnableTest();
        Thread t1 = new Thread(ru, "Thread-1");
        Thread t2 = new Thread(ru, "Thread-2");
        t1.start();
        t2.start();


        /*ThreadTest threadTest1 = new ThreadTest();
        Thread t3 = new Thread(threadTest1,"Thread-3");
        Thread t4 = new Thread(threadTest1,"Thread-4");
        t3.start();
        t4.start();*/

    }
}
