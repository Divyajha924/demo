package com.example.demo.stringExercise;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
       int m = s.length();
       int n = t.length();
       int i =0 , j =0;
       while(i < m && j < n){
          if(s.charAt(i) == t.charAt(j))
              i++;
          j++;
       }
        return i == m;
    }
    public  static  void main(String args[]){
        String s = "abc", t = "ahcbgd";
        System.out.println(isSubsequence(s,t));
    }
}
