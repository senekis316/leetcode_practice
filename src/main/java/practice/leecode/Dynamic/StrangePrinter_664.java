package practice.leecode.Dynamic;

public class StrangePrinter_664 {

    public int strangePrinter(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i][j - 1];
                } else {
                    int min = Integer.MAX_VALUE;
                    for (int k = i + 1; k < n - 1; k++) {
                        dp[i][j] = Math.min(min, dp[i][k] + dp[k + 1][j]);
                    }
                }
            }
        }
        return dp[n - 1][n - 1];
    }

}
