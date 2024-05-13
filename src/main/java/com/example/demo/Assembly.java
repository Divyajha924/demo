package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class Assembly {

    public static int getHighest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int[] getPair(int[] arr, int target){
        Arrays.sort(arr);
        // 1,2,3,4,5,33,76
        int i = 0, j = arr.length -1;
        while(i< arr.length -1&& j>-1){
            if(arr[i]>target) return null;
            if(arr[i]+arr[j]== target) {
                return new int[] {arr[i],arr[j]};
            } else if(arr[i]+arr[j]>target) {
                j--;
            } else i++;
        }

        return null;

    }

    public static void main(String args[]){
        int[] arr = {1,2,4,3,5,76,33,4} ;
        int highest = getHighest(arr);
        //System.out.println(highest);
        //int[] result = getPair(arr,80);
        //System.out.println(result.toString());

        //arr.stream().

    }

 /*   String str1 = new String("Highradius");
     String str2 = "Highradius";

    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));*/


}
