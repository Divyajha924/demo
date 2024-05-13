package com.example.demo.graph;

public class NumberofProvinces {
    public static int[][] connectionGraph ;
    public static boolean[] visited;

    public static int findCircleNum(int[][] isConnected) {
       connectionGraph = isConnected;
       int numOfCities = connectionGraph.length;
       int numOfprovinces = 0;

       visited = new boolean[numOfCities];
       for(int i=0; i< numOfCities; i++) {  // Iterate for one row
           if (!visited[i]) {
               dfs(i);
               numOfprovinces++;
           }
       }
       return numOfprovinces;
    }

    private static void dfs(int i) {
        visited[i] = true;
        for(int dest =0 ; dest < connectionGraph.length; dest++){
            if(!visited[dest] && connectionGraph[i][dest]==1){ //  It will call dfs for another city that is connected to it.
                dfs(dest);
            }
        }
    }

    public static  void main(String args[]){
        int [][] arr =
                {       {1, 1, 0, 0},
                        {1, 1, 0, 0},
                        {0, 0, 1, 1},
                        {0, 0, 1, 1}
                };
        System.out.println(findCircleNum(arr));

    }
}
