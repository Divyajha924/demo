package com.interview.question.Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationII {

    public static void main(String[] args) {
        int[] input = {10, 1, 2, 7, 6, 1, 5};
        Arrays.sort(input);
        int target = 8;
        List<List<Integer>> result = new ArrayList<>();
        findWays(input, target, new ArrayList<Integer>(), result, 0);
        for (List<Integer> o : result) {
            for (Integer val : o) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static void findWays(int[] input, int target, ArrayList<Integer> templist, List<List<Integer>> result, int start) {
        if(target == 0){
            result.add(new ArrayList<>(templist));
            return;
        }

        if(target<0){
            return;
        }

        for(int i = start; i<input.length && target >= input[i];i++){
            if (i > start && input[i] == input[i - 1])
                continue;
            templist.add(input[i]);
            findWays(input,target-input[i],templist,result,i+1);
            templist.remove(templist.size()-1);
        }

    }
}
