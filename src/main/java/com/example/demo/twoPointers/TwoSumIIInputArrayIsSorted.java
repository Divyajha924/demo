package com.example.demo.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int l =0; int r = numbers.length-1;
         while((numbers[l]+numbers[r])!=target){
          if((numbers[l]+numbers[r])>target){
              r--;
          }

          l++;

        }
        return new int[]{l+1,r+1};
    }

    public static  void main(String[] args){
        int[] nums2 = {2,7,11,15};
        int[] k = twoSum(nums2, 9);
        System.out.println(k);
    }
}
