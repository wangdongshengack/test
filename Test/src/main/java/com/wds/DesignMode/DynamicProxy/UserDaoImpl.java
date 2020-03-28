package com.wds.DesignMode.DynamicProxy;

public class UserDaoImpl implements UserDao{
    @Override
    public void add(String name) {
        System.out.println(name+ "执行的添加方法");
    }

    @Override
    public void delete() {
        System.out.println("删除方法");
    }
}
