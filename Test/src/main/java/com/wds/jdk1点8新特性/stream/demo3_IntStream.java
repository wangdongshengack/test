package com.wds.jdk1点8新特性.stream;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class demo3_IntStream {
    public static void main(String[] args) {
        int [] ints={1,5,9,2,5,63,4,8};
        System.out.println("________分割线① rangeClosed 使用_________");
        IntStream.rangeClosed(0,5).forEach(System.out::println);


        System.out.println("________分割线② range 使用_________");
        IntStream.range(0,5).forEach(System.out::println);


        System.out.println("________分割线② sum 使用_________");
        int sum = IntStream.rangeClosed(0, 5).sum();
        System.out.println(sum);


        System.out.println("________分割线② sorted 使用_________");
        IntStream.of(ints).sorted().forEach(System.out::println);

        System.out.println("________________");
        IntStream.of(ints).sorted().forEach(System.out::println);
    }
}
