package com.example.demo.javaEight;

import java.util.Arrays;
import java.util.List;

public class CountEmptyString {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("Divya","jha","","ankit","raj","","");

        //Empty String

       long count = strList.stream()
                .filter(str -> str.isEmpty())
                .count();
       System.out.println("Count of empty String :"+count);

       //Count String whose length is more than three

        long count1 =  strList.stream()
                 .filter(str -> str.length()>3)
                 .count();

        System.out.println("Count of Strings whose length is more than three : "+ count1);

        //Count number of String which starts with "a"

        //long count = strList.stream()

    }
}
