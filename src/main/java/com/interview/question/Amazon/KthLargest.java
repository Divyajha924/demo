package com.interview.question.Amazon;

import java.util.PriorityQueue;

public class KthLargest {
   static int size;

    static PriorityQueue<Integer> queue = new PriorityQueue<>();
    public  KthLargest(int k, int[] nums) {
       int size =k;
       for(Integer num:nums){
           this.add(num);
       }
    }

    public static  int add(int val) {
        queue.offer(val);

       while(queue.size()>size){
           queue.poll();
       }
       return queue.peek();
    }

    public static void main(String args[]) {

        KthLargest obj = new KthLargest(3, new int[]{4,5,8,2});
        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));
        //obj.printAll();
    }
}
