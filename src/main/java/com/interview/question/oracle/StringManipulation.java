package com.interview.question.oracle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringManipulation {

    public static void reverseString(String str){
       List<String> list = Arrays.stream(str.split(" "))
                .map(s -> getReverse(s))
                .collect(Collectors.toList());

       for(String st : list){
           System.out.print(" "+st);
       }
        System.out.println(" ");
    }

    public static String getReverse(String str){
       // System.out.println(str);
       char[] arr = str.toCharArray();
       //name ---> eman
       for(int i =0,j =arr.length-1;i<arr.length && j>-1 && i!=j&& j>i;i++,j--){
               char temp = arr[i];
               arr[i]= arr[j];
               arr[j]= temp;
       }
        //System.out.print(" "+String.valueOf(arr));
       return String.valueOf(arr);

    }

    public static void main(String[] args) {
        String s = "My name is Divya";
        //Output : “yM eman si ayviD"
        reverseString(s);
    }
}
