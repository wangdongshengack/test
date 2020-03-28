package com.wds.DesignMode.Anency;

public class TestClass {
    public static void main(String[] args) {
        //不UserDaoimpl类修改代码增加一个功能，使用代理模式

        //要代理的类
        UserDao userDao=new UserDaoimpl();


        //创建一个代理类, 参数指定为要代理的类
        ProxyClass proxyClass = new ProxyClass(userDao);
        proxyClass.add();
    }
}
