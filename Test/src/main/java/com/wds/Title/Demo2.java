package com.wds.Title;

import java.util.*;

public class Demo2 {

    /*编写程序解决以下问题：长度为N的数组，随机放入值为1-50中间的任意整数，
    请编写程序找出其中的偶数数字，从多到少排序输出*/
    public  void paixu1() {
        int num[]={1,20,30,25,41,22,56};
        List<Integer> list=new ArrayList<>();

         for (int i=0 ;i<num.length; i++){
             if(num[i]%2==0){
                 list.add(num[i]);
             }
          }
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }


    /*编写程序解决以下问题：长度为N的数组，随机放入值为1-50中间的任意整数，
    请编写程序找出其中的偶数数字，并按照该数字在数组中出现次数从多到少排序输出*/

}
