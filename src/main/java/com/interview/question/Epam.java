package com.interview.question;


import java.util.*;

/*    String arr[] = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };

        output:

        [epam, pame, aepm] contains same character

        [java, ajav] contains same character

        [abcd, dcba] contains same character*/
public class Epam {

    public static void main(String[] args) {

        String arr[] = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };

        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> stList = new ArrayList<>();

        for(int i =0; i< arr.length;i++){

            char[] chararray = arr[i].toCharArray();
            Arrays.sort(chararray);

            if(!map.containsKey(String.valueOf(chararray)))
            {

                List<String> sublist = new ArrayList<>();
                sublist.add(arr[i]);

                for (int j = i + 1; j < arr.length; j++) {
                    char[] chararr2 = arr[j].toCharArray();
                    Arrays.sort(chararr2);
                    if (Arrays.equals(chararray, chararr2)) {
                        sublist.add(arr[j]);
                    }
                }
                map.put(String.valueOf(chararray), sublist);
            }
        }
        System.out.println(map);
    }
}

/*
    GET method : http://localhost:8080/emp/{firstname}
        GET method : http://localhost:8080/emp/{lastname}
*/


