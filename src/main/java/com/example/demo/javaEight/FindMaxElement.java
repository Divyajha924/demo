package com.example.demo.javaEight;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,4,23,45,67);
         int max = list.stream()
                .max(Integer::compare)
                .get();
         System.out.println(max);
    }
}
