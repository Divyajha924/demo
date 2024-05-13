package com.example.demo.stringExercise;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        int i =0 , j = strs.length -1;
        char[] str1 = strs[0].toCharArray();
        char[] str2 = strs[strs.length -1].toCharArray();
        for(int k=0; k < str1.length && k< str2.length; k++)
            if(str1[k]==str2[k]){
                sb.append(str1[k]);
            } else {
                break;
            }
        return String.valueOf(sb);
        }

    public static void main(String[] args){
        String[] st = new String[]{"flower", "flow", "flight"};
      System.out.println(longestCommonPrefix(st));
    }

}
