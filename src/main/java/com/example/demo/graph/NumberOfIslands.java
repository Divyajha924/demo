/* https://leetcode.com/problems/number-of-islands/
   https://takeuforward.org/data-structure/number-of-islands/
 */
package com.example.demo.graph;


import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
        public static int numIslands(char[][] grid) {
            int numRow = grid.length;
            int numcol = grid[0].length;
            int numIsland =0;

            for(int i =0; i< numRow; i++){

                for(int j =0; j< numcol;j++){

                    if(grid[i][j]=='1'){
                        bfs(grid,i ,j);
                        numIsland++;
                    }

                }
            }
            return numIsland;
        }

        private static void bfs(char[][] grid, int i, int j) {

            int[][] directions = new int[][]{{-1,0},{0,-1},{0,1},{1,0}};

                grid[i][j] = '2';
                for (int[] dir : directions) {
                    int x =  i+ dir[0];
                    int y = j + dir[1];
                    if(x>-1 && y> -1 && x < grid.length && y < grid[0].length && grid[x][y] == '1' ) {
                       bfs(grid,x,y);
                    }
                }
        }


   /* public static int numIslands(char[][] grid) {
        int numRow = grid.length;
        int numcol = grid[0].length;
        int numIsland =0;
        boolean visited[][] = new boolean[numRow][numcol];

        for(int i =0; i< numRow; i++){

            for(int j =0; j< numcol;j++){

                if(grid[i][j]=='1' && !visited[i][j]){
                    queue.add(new Pair(i,j));
                    bfs(grid,visited);
                    numIsland++;
                }

            }
        }
     return numIsland;
    }

    private static void bfs(char[][] grid, boolean visited[][]) {

        int[][] directions = new int[][]{{-1,0},{0,-1},{0,1},{1,0}};
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            visited[pair.first][pair.second] = true;
            for (int[] dir : directions) {
                int x = pair.first + dir[0], y = pair.second + dir[1];
                if(x>-1 && y> -1 && x < grid.length && y < grid[0].length && !visited[x][y]&& grid[x][y] == '1' ) {
                    queue.add(new Pair(x, y));
                }
            }
        }
    }*/

    public static void main(String[] args)
    {
        char[][] grid =  {
                {'0', '1', '1', '1', '0', '0', '0'},
                {'0', '0', '1', '1', '0', '1', '0'}
        };

        char[][] grid2 =  {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };

        //[["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]
        System.out.println(numIslands(grid2));
    }
}
