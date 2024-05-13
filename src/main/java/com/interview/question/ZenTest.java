package com.interview.question;

import java.util.Arrays;
import java.util.HashSet;

public class ZenTest {

    /*1.Write Java Program to find Second Largest Number in an Array*/

    private static int getSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;
        for(int i =0 ; i< arr.length;i++){
            if(arr[i]>largest){
                secondLargest =  largest;
                largest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,4,6,3,3,4,6};
        System.out.println(getSecondLargest(arr));

    }
}
