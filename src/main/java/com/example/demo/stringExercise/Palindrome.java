package com.example.demo.stringExercise;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        int start = 0, last = s.length() -1;

        if(s.isEmpty()){
            return true;
        }

        while(start <= last){
            char first = s.charAt(start);
            char end = s.charAt(last);

            if(!Character.isLetterOrDigit(first))
            {
                start++;
            } else if(!Character.isLetterOrDigit(end)){
                last--;
            } else {
                if(Character.toLowerCase(first) != Character.toLowerCase(end)){
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    public  static  void main(String args[]){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

}