package com.wds.demo_text;

//父类：动物类
public class   Animal {

     public   void eat(){
        System.out.println("动物可以吃东西");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();

        animal.eat("大黄");
    }

    //重载
    public  void eat(String name){
        System.out.println(name +"这只狗在吃东西");
    }



}
