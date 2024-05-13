package com.striver.sheet.array.part1;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {

         // get breaking point , decrease i till you get first  decreasing sequence from last
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        // get the number which should be swapped
        if(i>=0) {
            int j = nums.length-1;
            while(j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        //reverse
        reverse(nums, i+1);
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start){
        int end = nums.length-1;
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,3};
        int[] arr2 ={5,4,7,5,3,2};

        nextPermutation(arr2);

        for(int i : arr2){
            System.out.println(i);
        }
    }

}
