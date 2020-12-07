package com.wds.bean;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @Author wds
 * @Date 2020/4/23 20:53
 * @Version 1.0
 */

public class Amount {
    private int money;
    private String name;
    private Date dateTime;

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());//2123271c-f24a-451a-9d6e-e60fafd15ccc
    }
}
