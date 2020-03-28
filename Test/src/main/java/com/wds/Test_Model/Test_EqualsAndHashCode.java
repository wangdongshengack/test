package com.wds.Test_Model;


import com.wds.Bean.Person;

import java.util.HashMap;
import java.util.Map;

public class Test_EqualsAndHashCode {
    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>(8);
        Person gege = new Person();
        gege.setAge(3);
        gege.setName("gege");
        map.put(gege,"哥哥");

        Person didi = new Person();
        didi.setAge(1);
        didi.setName("didi");
        map.put(didi,"弟弟");

        System.out.println(map.get(gege));
        System.out.println(map.get(didi));

        // 加入这个map传递给另一个方法,此时这个方法想拿到一个哥哥
        // new一个哥哥出来去get
        Person dagege = new Person();
        dagege.setName("gege");
        dagege.setAge(3);
        System.out.println(map.get(dagege));
    }

}
