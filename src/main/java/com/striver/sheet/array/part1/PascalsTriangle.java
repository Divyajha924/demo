package com.striver.sheet.array.part1;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {

        List<Integer> prevchildList;
        List<List<Integer>> plist = new ArrayList<>();

        for(int i =0; i< numRows;i++){
            List<Integer> childList = new ArrayList<>();
            for(int j =0 ; j <= i;j++){
                   if(j==0 || i ==j){
                       childList.add(1);
                   } else {
                       prevchildList = plist.get(i - 1);
                       int sumprev = prevchildList.get(j - 1) + prevchildList.get(j);
                       childList.add(sumprev);
                   }
            }
            plist.add(childList);
        }
     return plist;
    }

    public static void main(String[] args) {
        List<List<Integer>> plist = new ArrayList<>();
        plist = generate(5);
        for(List<Integer> clist : plist){
            for(Integer i : clist){
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
