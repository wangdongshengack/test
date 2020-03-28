package com.wds.Test;

import java.util.ArrayList;
import java.util.Collections;


public class TestDemo {
    public static void main(String[] args) {

        int[]str={1,2,3,4,5,6,7,8,9,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0 ;i<str.length; i++){
               list.add(str[i]);
          }
        Collections.sort(list,(a,b) -> a-b);
        System.out.println(list.get(0));
    }

}
