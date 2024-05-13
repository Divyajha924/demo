package com.example.demo.searching;

public class BinarySearch {

    public static int search(int[] nums, int target) {
       return biSearch(nums, target,0,nums.length -1);
    }

    private static int biSearch(int[] nums, int target, int low, int high) {
        if(low>high){
           return  -1;
        }
        int mid = high%2 ==0 ? (low+high)/2 : (low+high+1)/2;
        if(nums[mid] == target){
            return mid;
        }
       if(nums[mid] > target && mid ==high){
            high = mid- 1;
        } else if(nums[mid] > target){
            high = mid;
        } else if(nums[mid] < target && mid ==low) {
            low = mid+1;
        } else {
           low =mid;
       }
        return biSearch(nums,target,low,high);
    }

    public  static  void main(String args[])
    {
        int[] nums = {-1,0,3,5,9,12}; // Input array
        int target = 2; // Value to remove

        int k = search(nums, target); // Calls your implementation

        System.out.println(k);
    }

}
