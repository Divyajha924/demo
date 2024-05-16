package com.interview.question.applied;

import java.util.ArrayList;

public class AppliedQuestionThree {
    /*
    *  Arraylist , put method  and getMethod
    * maxCount  --> max size of queue
    * put is synchronized, get is sync,
    * if nothing to read getfunction will wait
    * if queue is full put is wait
    * get will remove
    * */

    static Integer max = 8;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void  put(int i) throws InterruptedException {
        synchronized(AppliedQuestionThree.class){
           if(list.size()>=max){
               //this..sleep(5000);
           }
           list.add(i);
        }
    }

    public static int get(int i) throws InterruptedException {
        synchronized(AppliedQuestionThree.class){
              int result = list.get(i);
              list.remove(i);
              return result;
        }
    }

    public static void main(String[] args) {

    }
}
