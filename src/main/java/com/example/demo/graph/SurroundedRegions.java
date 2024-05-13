package com.example.demo.graph;

/*Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.*/

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {


    public static void solve(char[][] board) {
        int[][] directions = new int[][]{{0,-1},{-1,0},{0,1},{1,0}};

        int row = board.length;
       int col = board[0].length;
       boolean[][] visited = new boolean[row][col];
        Queue<int[]> queue = new LinkedList<>();

           for(int j =0; j< col;j++){
              //
               if(board[row-1][j]=='O') queue.add(new int[]{row-1,j});

               if(board[0][j]=='O') queue.add(new int[]{0,j});
              // if(board[j][col-1]=='O') queue.add(new int[]{j,col-1});
           }

           for(int i =0 ; i< row ;i++){
               if(board[i][0]=='O') queue.add(new int[]{i,0});
               if(board[i][col-1]=='O') queue.add(new int[]{i,col-1});
           }


       while(!queue.isEmpty()) {
           int[] arr = queue.poll();
           visited[arr[0]][arr[1]] = true;
           for(int[] dir : directions) {
               int u = arr[0]+dir[0];
               int v = arr[1]+dir[1];
               if(u >-1 && v > -1 && u < row && v < col && board[u][v] == 'O' && !visited[u][v]){
                   queue.add(new int[] {u,v});
               }
           }
       }

        for(int i =0 ; i< row; i++){
            for(int j =0; j< col;j++){
                if(board[i][j]=='O' && !visited[i][j]) board[i][j]='X';
            }
        }
    }
    public static void main(String[] args)
    {
        char mat2[][] = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'O'}};

        char mat[][] = {
                {'X','O','X'},
                {'O','X','O'},
                {'X','O','X'}};

        // n = 5, m = 4

      //  ["X","O","X"],["O","X","O"],["X","O","X"]
        solve(mat);
        for(int i = 0;i < 3;i++) {
            for(int j = 0;j < 3;j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
