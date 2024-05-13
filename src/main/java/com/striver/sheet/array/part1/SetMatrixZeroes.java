package com.striver.sheet.array.part1;

import java.util.ArrayList;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> column = new ArrayList<>();

       for(int i =0 ; i< matrix.length; i++){
           for(int j= 0; j<matrix[0].length;j++){
               if(matrix[i][j]==0){
                   row.add(i);
                   column.add(j);
               }
           }
       }

       for(int i =0; i< column.size(); i++) {
           int col = column.get(i);
           for (int j = 0; j < matrix.length; j++) {
               matrix[j][col] = 0;
           }
       }

        for(int i =0; i< row.size(); i++) {
            int rownum = row.get(i);
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[rownum][j] = 0;
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1},{1,1,1}};
        setZeroes(arr);

        for(int i =0 ; i< arr.length; i++){
            for(int j= 0; j<arr[0].length;j++){
                System.out.print(" " +arr[i][j]);
            }
            System.out.println();
        }

    }
}
