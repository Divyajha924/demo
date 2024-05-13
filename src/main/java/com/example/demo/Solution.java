package com.example.demo;

import java.util.* ;
import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int l = arr.size()-1;
        for(int i=m+1;m<l;i++)
        {
            int temp = arr.get(l);
            arr.set(l, arr.get(i));
            arr.set(i, temp);
            m++;
            l--;
           // System.out.println("rough "+ arr.get(l+1));
        }

        int k= 0;
        while(k < arr.size()){
            System.out.print(arr.get(k));
            k++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //
        int numOfArr = sc.nextInt();
        for(int i =0; i< numOfArr ;i++) {
            int sizeofArr = sc.nextInt();
            int revafter = sc.nextInt();
            ArrayList<Integer> obj = new ArrayList<>();
            for(int j=0; j<sizeofArr; j++)
            {
//reading array elements from the user
             obj.add(sc.nextInt());
            }

            reverseArray(obj,revafter);
        }

    }
}
