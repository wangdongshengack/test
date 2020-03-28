package com.wds.jdk1点8新特性;

import java.util.*;

public class demo1{
    public static void main(String[] args) {
        /*TestService<Integer,Integer> t=(from -> from);
        Integer s = t.update(1);
        System.out.println(s);*/


        /*List<String> list = Arrays.asList("张三", "李四", "王二", "马武");*/
        //普通方法对数组进行排序
        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });*/


        //使用lambda表达式进行排序
      /*  Collections.sort(list,(a,b)-> b.compareTo(a));*/
        /*for (String s : list) {
            System.out.println(s);
        }*/

        ArrayList<Integer> int_list = new ArrayList<>();
        int_list.add(1);
        int_list.add(6);
        int_list.add(8);

        Collections.sort(int_list,(a,b)->a-b);

        for (Integer i : int_list) {
            System.out.println(i);
        }


    }

}
