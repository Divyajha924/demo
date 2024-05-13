package com.example.demo.graph;



import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TownJudge {

    public TownJudge townjudge = new TownJudge();

    @Test
    public void testFindJudge(){
      // int[][] trust = new int[][];
        Assert.assertEquals(-1 , townjudge.findJudge(1,new int[][]{}));
    }
    public int findJudge(int n, int[][] trust) {

        if(trust ==null) return -1;

        if(trust.length==0) return -1;

        int[] parents = new int[n + 1];

        for(int i =0;i<=n;i++){
            parents[i] =i ;
        }

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int[] data : trust){
            int a = data[0];
            int b = data[1];
            parents[a] = b ;
            map.computeIfAbsent(b, val -> new ArrayList<>()).add(a);
        }

        Iterator it = map.entrySet().iterator();

        while(it.hasNext()){
           Map.Entry e = (Map.Entry) it.next();

           ArrayList<Integer> members = (ArrayList<Integer>) e.getValue();
           if(members.size() == n-1){
               int key = (int) e.getKey();
               if(parents[key]!=key) return -1;
               return key;
           }
        }
        return -1;
    }
}
