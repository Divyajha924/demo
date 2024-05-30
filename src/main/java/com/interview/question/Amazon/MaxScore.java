package com.interview.question.Amazon;

class MaxScore {
    public static int maxScore(int[] cardPoints, int k) {

        int lsum=0, rsum =0, max_sum= 0;

        for(int i=0;i<k; i++) lsum += cardPoints[i];
        max_sum = lsum;

        int rindex = cardPoints.length-1;
        for (int i = k-1; i>-1;i--){
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rindex];
            rindex--;
            max_sum =  Integer.max(max_sum,lsum+rsum);
            // System.out.println(lsum+ "  "+rsum+ "  "+max_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(arr,k));

    }
}
