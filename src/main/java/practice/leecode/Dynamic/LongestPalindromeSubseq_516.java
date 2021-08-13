package practice.leecode.Dynamic;

public class LongestPalindromeSubseq_516 {

    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            char ch1 = s.charAt(i);
            for (int j = i + 1; j < n; j++) {
                char ch2 = s.charAt(j);
                if (ch1 == ch2) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }















//    public int longestPalindromeSubseq(String s) {
//        int n = s.length();
//        int[][] dp = new int[n][n];
//        for (int i = n - 1; i >= 0; i--) {
//            dp[i][i] = 1;
//            char ch1 = s.charAt(i);
//            for (int j = i + 1; j < n; j++) {
//                char ch2 = s.charAt(j);
//                if (ch1 == ch2) {
//                    dp[i][j] = dp[i + 1][j - 1] + 2;
//                } else {
//                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
//                }
//            }
//        }
//        return dp[0][n - 1];
//    }

}
