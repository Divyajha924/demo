package com.example.demo.stringExercise;

import java.util.Stack;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        //Stack<String> stack = new Stack<>();
        String[] words = s.split("\\s+");
        return words[words.length-1].length();

    }
    public  static  void main(String args[]){
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
