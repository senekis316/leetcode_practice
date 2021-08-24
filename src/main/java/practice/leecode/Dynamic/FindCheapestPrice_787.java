package practice.leecode.Dynamic;

import java.util.Arrays;

public class FindCheapestPrice_787 {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        final int INF = 10000 * 101 + 1;
        int[][] dp = new int[k + 2][n];
        for (int i = 0; i <= k + 1; i++) {
            Arrays.fill(dp[i], INF);
        }
        dp[0][src] = 0;
        for (int i = 1; i <= k + 1; i++) {
            for (int[] flight: flights) {
                int s = flight[0], d = flight[1], c = flight[2];
                dp[i][d] = Math.min(dp[i][d], dp[i - 1][s] + c);
            }
        }
        int ans = INF;
        for (int i = 1; i <= k + 1; i++) {
            ans = Math.min(ans, dp[i][dst]);
        }
        return ans == INF ? -1 : ans;
    }


//    private int min = Integer.MAX_VALUE;
//
//    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
//        return findCheapestPrice(flights, src, dst, k + 1, 0);
//    }
//
//    private int findCheapestPrice(int[][] flights, int src, int dst, int k, int price) {
//        if ((k == 0 && src != dst) || k < 0) return -1;
//        if (src == dst || price >= min) return price;
//        for (int[] flight : flights) {
//            if (flight[0] == src) {
//                int ans = findCheapestPrice(flights, flight[1], dst, k - 1, flight[2] + price);
//                min = ans != -1 ? Math.min(min, ans) : min;
//            }
//        }
//        return min == Integer.MAX_VALUE ? -1 : min;
//    }

}
