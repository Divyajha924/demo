package com.example.demo.graph;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int prevcolour = image[sr][sc];
        int numrows = image.length;
        int numcol = image[0].length;
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

        boolean visited[][] = new boolean[numrows][numcol];

        Queue<Integer[]> queue = new LinkedList<>();

        queue.add(new Integer[]{sr,sc});

        while(!queue.isEmpty()){
          Integer[] cell = queue.poll();

          int x = cell[0];
          int y = cell[1];
          visited[x][y] = true;
          for(int[] dir : directions){
              int u = x + dir[0];
              int v = y + dir[1];
              if(u>-1 && v> -1 && u< numrows && v < numcol && image[u][v]== prevcolour && !visited[u][v]){
                  queue.add(new Integer[]{u,v});
                  image[u][v]= color;
              }
          }
        }

        image[sr][sc] = color;
        return image;
    }

    public static void main(String args[]){
        // sr = 1, sc = 1, color = 2
      int[][] arr = {{1,1,1},{1,1,0},{1,0,1}};
         System.out.println(floodFill(arr,1,1,2));
    }
}
