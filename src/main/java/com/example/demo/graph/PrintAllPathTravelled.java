package com.example.demo.graph;

import model.Edge;

import java.util.ArrayList;

public class PrintAllPathTravelled {

  public static void printAllpath(ArrayList<Edge> graph[], boolean visited[] , int curr , int tar, String path){
    if(curr==tar){
        System.out.println(path);
        return;
    }


    for(int i =0; i< graph[curr].size(); i++){
        Edge e = graph[curr].get(i);
        if(!visited[e.dest]) {
            visited[curr] = true;
            printAllpath(graph, visited, e.dest, tar, path + e.dest);
            visited[curr] = false;
        }
    }

  }

    /*
          1 --- 3
         /      |   \
         0      |    5 -- 6
          \     |   /
           2----4
       */
}
