package com.example.demo.graph;

/*https://leetcode.com/problems/number-of-enclaves/description/*/

import java.util.LinkedList;
import java.util.Queue;

public class NumberofEnclaves {

    public static int numEnclaves(int[][] grid) {

        int row = grid.length , col = grid[0].length , count =0;
        Queue<int[]> queue = new LinkedList<>();

        int[][] directions = {{0,-1},{-1,0},{1,0},{0,1}};

        for(int i =0 ; i < row; i++){
           if(grid[i][0]==1){
               queue.add(new int[] {i,0});
               grid[i][0] =2;
           }
            if(grid[i][col-1]==1){
                queue.add(new int[] {i,col-1});
                grid[i][col-1] =2;
            }
        }

        for(int i =0 ; i < col; i++){
            if(grid[0][i]==1){
                queue.add(new int[] {0,i});
                grid[0][i] =2;
            }
            if(grid[row-1][i]==1){
                queue.add(new int[] {row-1,i});
                grid[row-1][i] =2;
            }
        }

        while(!queue.isEmpty()){
            int[] arr = queue.poll();

            for(int []dir: directions){
                int u = dir[0] + arr[0];
                int v = dir[1] + arr[1];

                if(u> -1 && v> -1 && u < row && v <col && grid[u][v]==1){
                    queue.add(new int[] {u,v});
                    grid[u][v] =2;
                }
            }
        }

        for(int i =1; i< row-1; i++) {
            for (int j = 1; j < col - 1; j++) {
                if (grid[i][j] == 1) count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {

        int[][] grid2 =  {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1},
        };

        //[["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]
        System.out.println(numEnclaves(grid2));
    }
}
