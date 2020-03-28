package com.wds.zhi_and_yinyong;

import com.wds.Bean.Person;

public class demo2 {

    /*对象的引用传递*/
    public static void main(String[] args) {
        String name="李四";
        Person person = new Person();
        person.setAge(20);
        change(person,name);
        System.out.println("main方法中person对象的年龄为： "+person.getAge());
        System.out.println("在main方法中name为： "+name);
    }

    static void  change(Person person,String name){

        name="张三";
        person.setAge(40);
        System.out.println("change方法中person对象的年龄为： "+person.getAge());
        System.out.println("在change方法中name为： "+name);
    }

}
