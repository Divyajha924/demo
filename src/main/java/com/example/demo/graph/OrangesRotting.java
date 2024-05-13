/*https://leetcode.com/problems/rotting-oranges/description/


*/
package com.example.demo.graph;

import java.util.LinkedList;
import java.util.Queue;
public class OrangesRotting {
    public static int orangesRotting(int[][] grid) {
       //get row and column , initialize queue and visited

        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = grid;
        Queue<Integer> q = new LinkedList<>();

       // Get count of rotten oranges and put then in queue
        int countFreshOrange = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == 2) {
                    q.offer(i*n+j);
                }
                // get count of fresh orange
                if (visited[i][j] == 1) {
                    countFreshOrange++;
                }
            }
        }

        // base case , if all are rotten return 0 and if none are rotten return -1

        if (countFreshOrange == 0)
            return 0;
        if (q.isEmpty())
            return -1;


       // for checking neighbours
        int minutes = -1;
        int[][] dirs = {{1, 0},{-1, 0},{0, -1},{0, 1}};

        //start polling till the queue is empty

        while (!q.isEmpty()) {
            int size = q.size();


            while (size-- > 0) {

                //poll rotten and get co-ordinates
                int cell = q.poll();
                int x = cell/n;
                int y = cell%n;

                // loop through neighbours
                for (int[] dir : dirs) {
                    int i = x + dir[0];
                    int j = y + dir[1];

                    // check if neighbours are valid coordinates and if they are fresh
                    if (i >= 0 && i < m && j >= 0 && j < n && visited[i][j] == 1) {
                        // make them rotten , decrease fresh count , add in queue
                        visited[i][j] = 2;
                        countFreshOrange--;
                        q.offer(i*n+j);
                    }
                }
            }
            minutes++;
        }

        if (countFreshOrange == 0)
            return minutes;
        return -1;
    }

    public static void main(String[] args){
        int[][] grid = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
       // Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
        //Output: 4
    }
}