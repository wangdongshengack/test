package com.wds.DesignMode.DynamicProxy;

import java.util.*;
import java.util.concurrent.*;


public class TestClass {


    public static void main(String[] args) {
        UserDao user=new UserDaoImpl();

        ProxyClass p = new ProxyClass(user);
        UserDao u = (UserDao) p.getProxtClass();
        u.add("张三");

        ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();

        HashMap<String, Object> map1 = new HashMap<>();





    }

}
