package com.example.demo.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class CountSortedVowelStrings {
    public static int countVowelStrings(int n) {
        int sum =0;
        List<List<Integer>> list = new ArrayList<>();

        if(n==0){
            return 0;
        }

        List<Integer> innerList = new ArrayList<>();
        innerList.add(1);
        innerList.add(1);
        innerList.add(1);
        innerList.add(1);
        innerList.add(1);

        list.add(innerList);
       if(!(n==1)){
        for(int i=1;i<=n;i++){
            List<Integer> prevList = list.get(i-1);
            List<Integer> newinnerList = new ArrayList<>();
            for(int j =0 ;j<=4;j++){
                int k =j, temp = 0;
                while(k<=4){
                   temp += prevList.get(k);
                   k++;
                }
                newinnerList.add(j,temp);
            }
            list.add(newinnerList);
        }
       }
        List<Integer> resList  = list.get(n-1);

        for(int i =0 ; i<= resList.size()-1;i++){
            sum += resList.get(i);
        }

        return sum;
    }

    public static  void main(String[] args){
        System.out.print(countVowelStrings(33));
    }
}
