package com.example.demo.arraysExercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        //List<Integer> list = Arrays.asList(nums);
       /* nums = Arrays.stream(nums).distinct().toArray();
        return nums.length;*/
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        int[] nums = {1,1,2}; // Input array
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums2);
        int[] expectedNums = {1,2}; // The expected answer with correct length

        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(" " +nums2[i]);
        }
    }
}
