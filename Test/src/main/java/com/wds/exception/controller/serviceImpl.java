package com.wds.exception.controller;


import com.wds.exception.CountException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class serviceImpl implements ServiceTest {
    /*@Autowired
    private TransactionTemplate transactionTemplate;*/

    @Override
    public String add() {
        int a=2;
        for (int i=0 ;i<3; i++){
            a++;
        }
        if(a>4){
           throw new CountException("不能大于4");
        }
        String b="a= "+a;


        /*transactionTemplate.execute(new TransactionCallback<Object>() {

            @Override
            public Object doInTransaction(TransactionStatus status) {
                return null;
            }
        });*/


        return b;
    }
}
