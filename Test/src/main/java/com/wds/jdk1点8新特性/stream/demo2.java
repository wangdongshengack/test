package com.wds.jdk1点8新特性.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("ddd2");
        list.add("aaa2");
        list.add("bbb1");
        list.add("aaa1");
        list.add("bbb3");
        list.add("ccc");
        list.add("bbb2");
        list.add("ddd1");
        /*
        * map会将元素根据指定的Function接口来依次将元素转成另外的对象，下面的示例展示了将字符串转换为大写字符串。
        * 你也可以通过map来讲对象转换成其他类型，map返回的Stream类型是根据你map传递进去的函数的返回值决定的。
        * */
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        long count = list.stream().count();
        System.out.println(count);
    }
}
