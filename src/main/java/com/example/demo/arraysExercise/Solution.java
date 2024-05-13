package com.example.demo.arraysExercise;

import static java.util.Arrays.sort;
/*https://leetcode.com/problems/remove-element/description/*/

class Solution {
        public static int removeElement(int[] nums, int val) {
            int index = 0;
            for(int i =0; i < nums.length; i++)
            {
                if(nums[i] != val)
                {
                    nums[index] = nums[i];
                    index ++;
                }
            }

            return index;
        }
    public  static  void main(String args[])
    {
        int[] nums = {0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
       int[] expectedNums = {0,1,4,0,3};
        // It is sorted with no values equaling val.

        int k = removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < nums.length; i++) {
            assert nums[i] == expectedNums[i];
        }

    }

    }

