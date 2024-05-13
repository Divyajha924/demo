package com.example.demo.graph;

import java.util.LinkedList;
import java.util.Queue;

public class Rottingorange {
    public static int orangesRotting(int[][] grid) {
        //get row and column , initialize queue and visited
        int row = grid.length;
        int column = grid[0].length;
        Queue<Integer> queue = new LinkedList<>();
        int freshOranges = 0;
        int rottenOranges = 0;

        // Get count of rotten oranges and put then in queue
          for(int i =0; i< row; i++){
              for(int j =0; j< column; j++){
                  if(grid[i][j]==1)freshOranges++; /*get count of fresh orange*/
                  if(grid[i][j]==2){
                      rottenOranges++;
                      queue.add(i*column+j);
                  }
              }
          }

        // base case , if all are rotten return 0 and if none are rotten return -1
        if(freshOranges==0) return 0;
        if(rottenOranges==0) return -1;

        // initialize minutes , directions array for checking neighbours

        int minutes =0;
        int[][] directions = new int[][]{{0,-1},{-1,0},{0,1},{1,0}};

        //start polling till the queue is empty
          while(!queue.isEmpty() && freshOranges>0){
              /*poll rotten and get co-ordinates
               *  loop through neighbours
               * check if neighbours are valid coordinates and if they are fresh
               *  make them rotten , decrease fresh count , add in queue
               * */
             /* 2 1 1
                1 1 0
                0 1 1  */
              int size = queue.size();
              for(int i =0; i< size;i++) {
                  int rotten = queue.poll();
                  int x = rotten / column;
                  int y = rotten % column;

                  for (int[] dir : directions) {
                      int u = x + dir[0];
                      int v = y + dir[1];
                      if (u >= 0 && v >= 0 && u < row && v < column && grid[u][v] == 1) {
                          grid[u][v] = 2;
                          freshOranges--;
                          queue.add(u * column + v);
                      }
                  }
              }

              minutes++; // increase minutes
          }
        System.gc();
        if(freshOranges==0) return minutes;
        else return -1;
        //if fresh orange count is zero  return time , else return -1
    }

    public static void main(String[] args){
        int[][] grid = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
        int[][] grid2 = new int[][]{{1,2}};
        System.out.println(orangesRotting(grid));
        // Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
        //Output: 4
    }
}
