package com.interview.question.Amazon;

class Duplicates {
    public static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast =0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);


        slow =0;

        while(slow!=fast){
            slow = nums[slow];
            fast= nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{2,5,9,6,9,3,8,9,7,1}));
    }
}
