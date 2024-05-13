package com.example.demo.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(1);
        pascal.add(first);

        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        pascal.add(second);

        if(rowIndex ==0) return first;

        for(int i=2 ; i<= rowIndex ; i++){
            List<Integer> prev = pascal.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1; j<= i-1; j++){
              curr.add(prev.get(j)+prev.get(j-1));
            }
            curr.add(1);
            pascal.add(curr);
        }
        return pascal.get(rowIndex);
    }
    public static  void main(String[] args){
        System.out.print(getRow(4));
    }
}
