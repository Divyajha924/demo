package com.example.demo.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinCostClimbingStairs {
    /*public static int minCostClimbingStairs(int[] cost) {
       int n = cost.length;
       return Math.min(minCost(cost, n-1), minCost(cost, n-2));
    }*/

    private static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for(int k =2; k< cost.length;k++){
            cost[k] = cost[k] + Math.min(cost[k-1] , cost[k-2]);
        }
        return Math.min(cost[n-1] , cost[n-2]);
    }

    public static void main(String[] args){
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(arr));
    }
}
