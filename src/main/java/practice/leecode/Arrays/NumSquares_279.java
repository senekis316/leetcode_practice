package practice.leecode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class NumSquares_279 {

    private Map<Integer, Integer> min = new HashMap<>(100);

    public int numSquares(int n) {
        int[] min = new int[100];
        int sqrt = (int) Math.sqrt(n);
        for (int i = 0; i <= sqrt; i++) {
            int sum = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                sum = Math.min(sum, min[i - j * j]);
            }
            min[i] = sum + 1;
        }
        return min[n];
    }


}
