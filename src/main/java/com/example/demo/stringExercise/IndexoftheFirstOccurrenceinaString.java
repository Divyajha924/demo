package com.example.demo.stringExercise;

public class IndexoftheFirstOccurrenceinaString {
    public static int strStr(String haystack, String needle) {
       return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        String s = "sadbutsad";
        String t = "sad";
        System.out.println(strStr(s, t));
    }
}
