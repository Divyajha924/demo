package com.striver.sheet.array.part4;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

       for(int i = 0;i< nums.length;i++){
         if(map.containsKey(target-nums[i])){
             result[1]= i;
             result[0] = map.get(target-nums[i]);
         }
         map.put(nums[i],i);
       }
        return result;
    }

    public static void main(String[] args) {
       int[]  arr = {2,7,11,15};
        int [] result = twoSum(arr,9);
        Arrays.stream(result)
                .forEach(System.out::println);
    }
}
