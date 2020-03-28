package com.wds.集合.MapTest;


import com.wds.集合.Person;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Demo1 {

    /*HashMap使用自定义对象为key的话要重写equals()和 hashCode()*/
    public static void main(String[] args) {
        /*Person p1 = new Person("张三",20);
        Person p2 = new Person("李四",20);
        Person p3 = new Person("李四",20);
        HashMap<Person, Integer> map = new HashMap<>();
        map.put(p1,1);
        map.put(p2,3);
        map.put(p3,3);

        System.out.println(map.get(new Person("张三",20)));
        System.out.println(map.get(new Person("李四",20)));
        System.out.println(map.get( new Person("李四",20)));*/
        //不重写equals()和hashCode()方法，输出结果为：null null null.
        //重写equals()和hashCode()方法，输出结果为 1 3 3



    }

}
