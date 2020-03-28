package com.wds.jdk1点8新特性;


public interface TestService<T,F> {

     abstract T  update(F from);

    default void  add(){
        System.out.println("定义添加方法");
    }



}
