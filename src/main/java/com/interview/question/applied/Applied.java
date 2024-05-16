package com.interview.question.applied;

public class Applied {

    public static boolean ispalindrome(String str){

        char[] arr = str.toCharArray();
        for(int i = 0,j = arr.length-1; i< arr.length&& j>-1;i++,j--){
            if(i==j){
                return true;
            }

           // if(arr[i]==arr[j]) continue;
            if(arr[i]!=arr[j]) return false;
        }

        return true;
    }

    public static boolean isAlmostpalindrome(String str){

          //dossod
        //dosode //deosod
        int nonpalinCharCount =0;
        char[] arr = str.toCharArray();
        int i =0 , j=arr.length-1;

        while(i<arr.length && j>-1){
          if(i==j) return true;
          if(nonpalinCharCount>1) return false;
          if(arr[i]!=arr[j]){
              if(i+1<arr.length && arr[i+1]==arr[j]){
                 i++;
              } else if(j-1>-1 && arr[j-1]==arr[i]){
                  j--;
              }
              nonpalinCharCount++;
          } else {
              i++;
              j--;
          }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "dosod";
       // System.out.println(ispalindrome(str));
        System.out.println(isAlmostpalindrome("dosode"));
        System.out.println(isAlmostpalindrome("deosod"));
        System.out.println(isAlmostpalindrome("doseiod"));


        System.out.println(ispalindrome("dossod"));
        System.out.println(ispalindrome("dosod"));
        System.out.println(ispalindrome("deosod"));

    }
}
