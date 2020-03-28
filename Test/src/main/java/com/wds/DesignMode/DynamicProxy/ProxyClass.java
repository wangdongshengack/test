package com.wds.DesignMode.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyClass {
    private UserDao dao;
    //构造方法
    public  ProxyClass (UserDao userDao){
        this.dao=userDao;
    }

    //构建动态代理
    public Object getProxtClass(){
        //参数一：要代理的对象 参数二：代理对象的接口 参数三：一个事件，它是一个接口
        return Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {

            //参数一：一个对象，参数二 调用的方法 参数三 ：是否方法中是否有参数
            @Override
            public Object invoke(Object proxy, Method method, Object[] o) throws Throwable {
                System.out.println(method.getName());

                Object invoke = method.invoke(dao, o);
                System.out.println("代理类中的方法");
                return invoke;
            }
        });
    }
}
