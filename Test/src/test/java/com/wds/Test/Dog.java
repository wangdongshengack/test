package com.wds.Test;

import java.util.HashMap;

public class Dog implements AnimalService{

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public static void main(String[] args) {

    }
}
