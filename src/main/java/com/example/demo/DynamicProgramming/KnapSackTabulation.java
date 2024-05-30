package com.example.demo.DynamicProgramming;

public class KnapSackTabulation {
     static int[][] dp;

    static int solve(int[] weight, int[] value, int n, int maxWeight){

        for(int i = weight[0]; i<=maxWeight;i++ ){
            if(weight[0]<=maxWeight)
                dp[0][maxWeight] =  value[i];
            else
                dp[0][maxWeight] =0;
        }

        if(dp[n][maxWeight]!=-1) return  dp[n][maxWeight];

        int include =0;
        for(int i =1;i<n;i++){
            for(int w = 0;w<= maxWeight;w++){
                if(weight[w]<=maxWeight)
                    include = value[i] +  dp[n-1][maxWeight - weight[i]];

                int exclude = 0+  dp[n-1][maxWeight];
                dp[i][w] = Math.max(include,exclude);
            }
        }

        return dp[n-1][maxWeight];
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
