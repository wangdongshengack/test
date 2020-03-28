package com.wds.jdk1点8新特性.stream;


import java.util.ArrayList;
import java.util.List;



public class demo1 {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        list.add("ddd2");
        list.add("aaa2");
        list.add("bbb1");
        list.add("aaa1");
        list.add("bbb3");
        list.add("ccc");
        list.add("bbb2");
        list.add("ddd1");*/
        //使用filter进行过滤
        //list.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
        ArrayList<Integer> int_list = new ArrayList<>();
        int_list.add(300);
        int_list.add(111);
        int_list.add(112);
        int_list.add(113);
        int_list.add(222);
        //不指定参数默认从小到大排序
       /* int_list.stream().sorted().forEach(System.out::println);*/
        //也可以指定参数
        int_list.stream().sorted().forEach(System.out::println);
        System.out.println("查看元素位置是否改变： "+ int_list.get(2));
        /*需要注意的是，排序只创建了一个排列好后的Stream，而不会影响原有的数据源，
        排序之后原数据list是不会被修改的*/


      /*   求出集合中的元素总和
        ArrayList<Integer> int_list = new ArrayList<>();
        int_list.add(10);
        int_list.add(20);
        int_list.add(30);
        int_list.add(50);
        int_list.add(40);
        Integer collect = int_list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(collect);*/

    }

}
