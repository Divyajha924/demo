package com.interview.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SyncInterview {

    public static void main(String[] args) {
       String st = "@34%trhjgh%%%";

       char[] arr = st.toCharArray();

       ArrayList<Character> list = new ArrayList<>();

        for(int i =0; i< st.length();i++){
            list.add(st.charAt(i));
        }

             list.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                     .stream()
                     .forEach(System.out::println);

    }
}
