package com.chubb.question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacters {

    public static void main(String[] args) {

        //Given a string, count all the characters in it.
        //Input: str = "aaAccckkkkdddppppccccc"
        //Output: p=4, a=3, c=8, k=4, d=3
        String str = "aaAccckkkkdddppppccccc";



        Arrays.stream(str.split(""))
                .map(ch -> ch.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new,Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);

    }
}


