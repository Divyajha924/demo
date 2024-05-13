package com.interview.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CoforgeTest {

    public static void main(String[] args) {
        String st = "adfhgjhgjkjortc";

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < st.length(); i++) {
            list.add(st.charAt(i));
        }

        Arrays.stream(st.split(""))
                        .collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()
        )).entrySet().forEach(System.out::println);

        /*list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet().forEach(System.out::println);*/
    }
}


