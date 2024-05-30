package com.example.demo.DynamicProgramming;

class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int len = s.length() - 1;
        boolean[][] dp = new boolean[len+1][len+1];
        int max_length = 1;
        String max = null;

        for (int i = 0; i <= len; i++) {
            dp[i][i] = true;
            max = String.valueOf(s.charAt(i));
        }

        for (int i = 0; i <= len-1; i++) {
                if (s.charAt(i) == s.charAt(i+1)) {
                    dp[i][i+1] = true;
                    max_length = 2;
                    max = s.substring(i, i+2);
                }
        }

        for(int length =3 ;length<=len+1;length++){
            for (int i = 0; i <= len-length+1; i++) {
               int j = i+ length -1;;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if ((j - i) + 1 > max_length) {
                        max_length = (j - i) + 1;
                        max = s.substring(i, j+1);
                        //System.out.println("max"+max);
                    }
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaaa"));
    }
}
