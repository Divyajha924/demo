package com.example.demo.graph;

import model.Edge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateGraph {

    static void  createGraph(ArrayList<Edge> graph[]){
        for(int i =0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));


        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));


        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));


        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));


        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(6, 5, 1));
    }

    public static void bfs(ArrayList<Edge> graph[], int V){
        boolean visited[] = new boolean[V];

        Queue<Integer> q = new LinkedList<>();

        q.add(0);

        while(!q.isEmpty()){
          int curr = q.poll();

          if(!visited[curr]){
              visited[curr] = true;
              System.out.println(curr);

              for(int i =0; i< graph[curr].size();i++){
                  q.add(graph[curr].get(i).dest);
              }
          }
            System.out.println();
        }

    }

    static void dfs(ArrayList<Edge> graph[], int curr , boolean vis[]){

        if(vis[curr]) return;

        vis[curr] = true;
        System.out.println(curr);

        for(int i =0; i< graph[curr].size() ;i++){
            Edge e = graph[curr].get(i);
            dfs(graph,e.dest,vis);
        }


    }

    public static  void main(String[] args){
       /*
          1 --- 3
         /      |   \
         0      |    5 -- 6
          \     |   /
           2----4
       */
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
       // bfs(graph,7);
        boolean visited[] = new boolean[V];
        dfs(graph,0,visited);
    }

}
