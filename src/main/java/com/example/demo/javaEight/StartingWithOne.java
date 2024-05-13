package com.example.demo.javaEight;

import java.util.Arrays;
import java.util.HashSet;

public class StartingWithOne {

    private static void CheckIfStartsWithOne(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
       Arrays.stream(arr).filter(s -> !hs.add(s))
               .forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {10, 11,2,3,6,18,22,11,7,6};
        CheckIfStartsWithOne(arr);
    }


}
