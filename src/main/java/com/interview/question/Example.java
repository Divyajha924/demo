package com.interview.question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Example {

    public static void modify(int[] num){
        /*HashSet<Integer> set = new HashSet<>();
        *  /* Input: nums = [1,1,2,2,2,3,3,4,4]*/
       int i=0,j=1;
        while(j< num.length && i < num.length){
           while(j< num.length && num[j]==num[i]) {
               j++;
           }
           if((j-i)>2){
               num[j-1] = num[j];
               i = j-1;
               continue;
           }
         i++;
        }
        System.out.print(num);

    }

    public static void main(String[] args) {
        /* Input: nums = [1,1,1,2,2,2,3,3,4,4] Output: 2, nums = [1,2,3,4]*/

       int[] nums = {1,1,2,2,2,3,3,4,4,4};

       modify(nums);

    }
}
