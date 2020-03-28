package com.wds.jdk1点8新特性;

import java.util.ArrayList;
import java.util.List;

public class demo4 {
    public static void main(String[] args) {
        demo4 demo4 = new demo4();
        demo4.Remove_String_Test();
    }

    void Remove_Integer_Test(){
        //删除指定数组中指定的元素 Integer类型
        int[] str={1,3,5,8};
        List<Integer> list = new ArrayList<>();
        for (int i : str) {
            list.add(i);
        }
        list.removeIf(integer -> integer==3);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }


    void Remove_String_Test(){
        //删除集合中带有某个字母的元素
        List<String> list = new ArrayList<>();
        list.add("aab");
        list.add("aaa");
        list.add("bbb");
        list.removeIf(s -> s.contains("a"));
        for (String s : list) {
            System.out.println(s);
        }

    }
}
