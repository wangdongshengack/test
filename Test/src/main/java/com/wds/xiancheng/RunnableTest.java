package com.wds.xiancheng;

public class RunnableTest implements Runnable{
    private int ticket=5;
    public void run(){
        for(int i=0;i<100;i++){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"卖票：ticket"+ticket--);
            }
        }
    }
}
