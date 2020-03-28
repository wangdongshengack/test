package com.wds.exception.controller;

import com.wds.exception.CountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@RestController
public class ControllerTest {
    @Autowired
    ServiceTest service;

    @RequestMapping("test")
    public  String  test(){
        try {
            String add = service.add();
            System.out.println("send a message ="+"我是RequsetMapping");
            return add;
        } catch (CountException e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }


   /* @PostConstruct
    public void sendMessage(){
        System.out.println("send a message ="+"我是PostConstruct");
    }

    @PreDestroy
    public void sendTwoMessage(){
        System.out.println("send a messgae="+"我是PreDestroy");
    }*/

}
