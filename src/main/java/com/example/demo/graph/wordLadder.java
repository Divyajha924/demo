package com.example.demo.graph;

import java.io.IOException;
import java.util.*;

class Pair {
    String first;
    int second;
    Pair(String _first, int _second) {
        this.first = _first;
        this.second = _second;
    }
}
public class wordLadder {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> queue = new LinkedList<>();

        HashSet<String> set = new HashSet<>();
        for(int i =0 ; i < wordList.size() ;i++){
            set.add(wordList.get(i));
        }

        queue.add(new Pair(beginWord,1));
        set.remove(beginWord);
        StringBuilder st = new StringBuilder(1);

        while(!queue.isEmpty()){
          Pair pair = queue.poll();

          String first = pair.first;
          int steps = pair.second;

          if(first.equals(endWord)) return steps;

          for(int i =0; i< first.length();i++){
              for(char ch ='a'; ch<='z'; ch++){
                  char[] replaced = first.toCharArray();
                  replaced[i] = ch;
                  String replaceword = new String(replaced);

                  if(set.contains(replaceword)){
                     set.remove(replaceword) ;
                     queue.add(new Pair(replaceword, steps+1));
                  }
              }
          }
        }


        return 0;
    }

    public static void main(String[] args) throws IOException {
        String startWord = "der", targetWord = "dfs";
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("des");
        wordList.add("der");
        wordList.add("dfr");
        wordList.add("dgt");
        wordList.add("dfs");

        int ans = ladderLength(startWord, targetWord, wordList);

        System.out.print(ans);

        System.out.println();
    }
}
