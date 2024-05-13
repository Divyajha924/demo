package com.example.demo.javaEight;

import java.util.Arrays;

public class EvenNumbers {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5,7,8};
        Arrays.stream(arr).filter(n -> n%2==0)
                .forEach(System.out::println);
    }
}
