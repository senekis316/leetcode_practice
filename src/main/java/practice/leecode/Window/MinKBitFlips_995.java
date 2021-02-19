package practice.leecode.Window;

public class MinKBitFlips_995 {

    public int minKBitFlips(int[] A, int K) {
        int N = A.length;
        int[] hint = new int[N];
        int res = 0, flip = 0;
        for (int i = 0; i < N; i++) {
            flip ^= hint[i];
            if (A[i] == flip) {
                if (i + K > N) return -1;
                res++;
                flip ^= 1;
                if (i + K < N) hint[i + K] ^= 1;
            }
        }
        return res;
    }

//    public int minKBitFlips(int[] A, int K) {
//        int res = 0;
//        int[] cnt = new int[A.length];
//        for (int i = 0; i < A.length; i++) {
//            if ((A[i] + cnt[i]) % 2 == 0) {
//                if (i > A.length - K) {
//                    return -1;
//                }
//                res++;
//                if (K > 1) {
//                    for (int j = i; j < i + K; j++) {
//                        cnt[j] += 1;
//                    }
//                }
//            }
//        }
//        return res;
//    }

}
