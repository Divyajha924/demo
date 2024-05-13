package com.interview.question;

public class SecondLargest {

     public static int getSecondlargest(int[] arr){

         int maxlarge = Integer.MIN_VALUE;
         int secLarge = Integer.MIN_VALUE;

         for(int i=0; i< arr.length;i++){
             //2,4,3,1,5,7,9
             if(arr[i] > maxlarge){
                 secLarge = maxlarge;
                 maxlarge = arr[i];

             }

         }


         return secLarge;
     }
   /* Find the second largest element in an array without sorting, without internal methods and at max single loop.?*/
    public static void main(String[] args) {
        int[] arr = {2,4,3,1,5,7,9};

       System.out.println(getSecondlargest(arr));

    }
}
