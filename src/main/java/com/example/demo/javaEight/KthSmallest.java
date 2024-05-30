package com.example.demo.javaEight;

import java.util.Arrays;
import java.util.List;

public class KthSmallest {

    // Inputs
    static int k = 4;

    static Integer[] myIntArray = {2, 3, 1, 4, -2, 0, -3, 0, -1, 5 };

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(myIntArray);

        int smallest = list.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .limit(k)
                .skip(k)
                .findFirst()
                .getAsInt();
        System.out.println(smallest);
    }
}