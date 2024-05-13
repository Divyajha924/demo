package com.example.demo.graph;

import java.util.LinkedList;
import java.util.Queue;

public class Matrix {

    static int[][] mat2 ;
    static int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

    static boolean[][] lastvisited ;


    public static int[][] updateMatrix(int[][] mat) {

        mat2 = mat;
        boolean [][] visited = new boolean[mat.length][mat[0].length];
        int[][] result = new int[mat.length][mat[0].length];
        Queue<int[]> queue = new LinkedList<>();

        for(int i =0; i< mat.length;i++){
            for(int j =0 ; j< mat[0].length; j++){
                if(mat[i][j]==0){
                    //result[i][j] =0;
                    visited[i][j]= true;
                    queue.add(new int[] {i,j,0});
                }
            }
        }

        while(!queue.isEmpty()){
            int[] arr = queue.poll();
            int dist = arr[2];
            result[arr[0]][arr[1]] = dist;
            for(int[] dir: directions){
                int u = arr[0] + dir[0];
                int v = arr[1] + dir[1];
                if(u> -1 && v> -1 && u < mat.length && v< mat[0].length  && !visited[u][v]){
                    visited[u][v]=true;
                    queue.add(new int[]{u,v,dist+1});
                }
            }


        }
      return result;
    }



    public static  void main(String[] args){
        System.out.println(updateMatrix(new int[][] {{0,0,0},{0,1,0},{1,1,1}}));
    }
}
