package com.wds.zhi_and_yinyong;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class demo1 {
    /*对象的值传递*/
    public static void main(String[] args) {
        int a=1;
        change(a);
        System.out.println("main方法中a的值为 :  "+a);


    }
    //改变传入的参数值
    static  void  change(int a){
        a=2;
        System.out.println("change方法中a的值为  ： "+a);


        /*Integer i=new Integer(200);
        Integer j=new Integer(200);*/
        Integer i = 200;
        Integer j = 200;
        System.out.println(i==j);
    }




}
