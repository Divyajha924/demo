package com.interview.question;

public class tableOfFive {
    // 5*1 , 5*2,
    public static void getTableOfFive(int target, int count){
        if (count == 0) return;

        getTableOfFive(5,count-1);
        System.out.println(target * count);

    }
    public static void main(String[] args) {
        getTableOfFive(5,10);
    }
}
