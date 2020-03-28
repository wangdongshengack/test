package com.wds.jdk1点8新特性;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class demo2 {
    public static void main(String[] args) {
        /*使用 :: 关键字来传递方法和构造函数的引用*/

        TestService<PersonClass,String> t=PersonClass::new;
        PersonClass zs = t.update("张三");
        System.out.println(zs.getName());
    }

}
