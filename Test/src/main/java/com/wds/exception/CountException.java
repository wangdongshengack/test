package com.wds.exception;

public class CountException extends RuntimeException{
   public CountException(){
        super();
    }
   public  CountException(String message){
        super(message);
    }
}
