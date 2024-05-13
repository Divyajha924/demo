package com.example.demo.stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
       for(Character c : s.toCharArray()){
           if(c == '(')
               stack.push(')');
           else if(c == '{')
               stack.push('}');
           else if(c == '[')
               stack.push(']');
           else if(stack.empty() || (c != stack.pop()))
               return false;
       }

        return stack.empty();
    }

    public  static  void main(String args[])
    {
        System.out.println(isValid("}"));
        System.out.println(isValid("(("));
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }
}