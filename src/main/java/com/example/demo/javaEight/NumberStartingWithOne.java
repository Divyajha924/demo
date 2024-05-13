package com.example.demo.javaEight;

import java.util.Arrays;

public class NumberStartingWithOne {

    public static void main(String[] args) {
        int[] arr = {1, 12,32,42,15,16};

/*        Arrays.stream(arr)
                .filter(n -> n/10 ==1)
                .forEach(System.out::println);*/

        Arrays.stream(arr)
                .mapToObj(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);

    }
}
