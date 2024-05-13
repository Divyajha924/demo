package com.example.demo.arraysExercise;

public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {

        int buyPrice = Integer.MAX_VALUE;
        int profitIfSoldToday = 0;
        int mostprofit = 0;


        for(int i =0 ; i<prices.length; i++){
           if(prices[i] < buyPrice){
               buyPrice = prices[i];
           }
           profitIfSoldToday =  prices[i] - buyPrice;

           if(profitIfSoldToday > mostprofit) {
               mostprofit = profitIfSoldToday;
           }

        }

        return mostprofit;
    }

    public static  void main(String[] args){
        int[] nums = {3,3,5,0,0,3,1,4}; // Input array
        int[] nums2 = {7,1,5,3,6,4};
        int k = maxProfit(nums2);
        System.out.println(k);
    }
}
