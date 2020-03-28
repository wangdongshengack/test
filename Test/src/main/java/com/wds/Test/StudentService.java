package com.wds.Test;

//定义一个接口
public interface StudentService {

    //接口方法声明
    public void  addOne();

    //接口方法实现
    default void  addTwo(){
        System.out.println("你好啊，我是添加方法");
    }
}
