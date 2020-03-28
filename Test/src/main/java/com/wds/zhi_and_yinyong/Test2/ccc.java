package com.wds.zhi_and_yinyong.Test2;

import java.util.HashMap;

public class ccc {
    public static void main(String[] args) {
        HashMap<bbb, String> map = new HashMap<>();
        bbb b1 = new bbb(1);
        bbb b2 = new bbb(1);
        map.put(b1,"张三");
        map.put(b2,"王五");



        System.out.println( map.get(b2));

        System.out.println(b1.hashCode()+"  "+ b2.hashCode());
    }
}
