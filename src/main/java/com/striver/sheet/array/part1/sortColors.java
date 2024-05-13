package com.striver.sheet.array.part1;

import java.util.Arrays;

public class sortColors {
    public static void sortColors(int[] nums) {
        int cnt0 =0, cnt1 =0, cnt2 =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) cnt0++;
            else if(nums[i]==1) cnt1++;
            else cnt2++;
        }

        for(int i = 0;i<nums.length;i++){
            if(i<cnt0) nums[i]=0;
            if(i>=cnt0&&i<cnt0+cnt1) nums[i] =1;
            if(i>=cnt0+cnt1 && i<nums.length) nums[i] =2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,0,2,1,2,1,0,2,1};
        sortColors(arr);
        Arrays.stream(arr)
                .forEach(System.out::println);
        //System.out.println();
    }
}
