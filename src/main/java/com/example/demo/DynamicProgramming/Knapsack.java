package com.example.demo.DynamicProgramming;

import java.util.* ;
import java.io.*;

public class Knapsack{

    static int[][] dp;

    static int solve(int[] weight, int[] value, int n, int maxWeight){

        if(n==0){
            if(weight[n]<=maxWeight) return value[n];
            else return 0;
        }

        if(dp[n][maxWeight]!=-1) return  dp[n][maxWeight];

        int include =0;

        if(weight[n]<=maxWeight)
            include = value[n] + solve(weight,value,n-1, maxWeight - weight[n]);

        int exclude = 0+ solve(weight,value,n-1, maxWeight);
        dp[n][maxWeight] = Math.max(include,exclude);
        return dp[n][maxWeight];
    }

    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        dp = new int[n][maxWeight+1];

        for(int i =0;i<n ; i++){
            for (int j =0; j<maxWeight+1;j++ )
                dp[i][j] =-1;
        }
        int result = solve(weight,value,n-1,maxWeight);
        return result;
    }
}
