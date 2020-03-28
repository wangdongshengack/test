package com.wds.DesignMode.Anency;

public class ProxyClass implements UserDao{
    private UserDao dao;

    //创建构造方法
    public ProxyClass(UserDao userDao){
        this.dao=userDao;
    }


    @Override
    public void add() {
        dao.add();
        //增加其他功能
        System.out.println("查询方法");
    }
}
