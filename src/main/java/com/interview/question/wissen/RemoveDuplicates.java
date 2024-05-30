package com.interview.question.wissen;

public class RemoveDuplicates {

    static int removeDuplicates(int arr[], int n){

        int newSize =1;

        int i =0, j=0;
        arr[j] = arr[i];
        i++;
        while(i< n-1 && j<n){
         if(arr[i]==arr[j]){
             i++;
         }else{
             j++;
             arr[j]= arr[i];
             i++;
             newSize++;
         }
        }

       return newSize;

    }



    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int n = arr.length;

        // removeDuplicates() returns new size of array
        n = removeDuplicates(arr, n);

        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
