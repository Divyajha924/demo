package com.example.demo.arraysExercise;

/*https://leetcode.com/problems/plus-one/description/*/

public class PlusOne {
    public static  int[] plusOne(int[] digits) {

        for(int i = digits.length-1;i>=0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
            digits = new int[digits.length+1];
            digits[0] =1;
            return digits;

    }

    public static void main(String args[]){
        int[] nums = {9,8,7,6,5,4,3,2,1,0}; // Input array
        int[] nums2 = {9,9,9};
        int[] nums3 = {1,9};

        plusOne(nums);
        plusOne(nums3);
    }

}
