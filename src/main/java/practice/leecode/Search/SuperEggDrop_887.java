package practice.leecode.Search;

public class SuperEggDrop_887 {

    public int superEggDrop(int K, int N) {
        int[] dp = new int[K + 1];
        int res = 0;
        while(dp[K] < N){
            for(int i = K; i > 0; i--){
                dp[i] = dp[i] + dp[i - 1] + 1;
            }
            res++;
        }
        return res;
    }


//    private Map<Integer, Integer> memo;
//
//    public int superEggDrop(int K, int N) {
//        memo = new HashMap();
//        return drop(K, N);
//    }
//
//    private int drop(int K, int N) {
//        if (!memo.containsKey(N * 100 + K)) {
//            int ans;
//            if (N == 0) {
//                ans = 0;
//            } else if (K == 1) {
//                ans = N;
//            } else {
//                int lo = 1, hi = N;
//                while (lo + 1 < hi) {
//                    int x = (lo + hi) / 2;
//                    int t1 = drop(K - 1, x - 1);
//                    int t2 = drop(K, N - x);
//                    if (t1 < t2) {
//                        lo = x;
//                    } else if (t1 > t2) {
//                        hi = x;
//                    } else {
//                        lo = hi = x;
//                    }
//                }
//                ans = 1 + Math.min(Math.max(drop(K - 1, lo - 1), drop(K, N - lo)), Math.max(drop(K - 1, hi - 1), drop(K, N - hi)));
//            }
//            memo.put(N * 100 + K, ans);
//        }
//        return memo.get(N * 100 + K);
//    }

}
