package com.interview.question.amex;

public class Test {

    public static void main(String[] args) {
        int arr[] = {10,9,8,10,4,5};

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i =0; i< arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }

            if(arr[i]>secondlargest && arr[i]<largest){
                secondlargest = arr[i];
            }
        }

        System.out.println(secondlargest);
    }
}
