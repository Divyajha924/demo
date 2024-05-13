package com.example.demo.stringExercise;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
       List<Character> list1 =  s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> list2 = t.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Collections.sort(list1);
        Collections.sort(list2);
      return list1.equals(list2);
    }
    public  static  void main(String args[]){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
