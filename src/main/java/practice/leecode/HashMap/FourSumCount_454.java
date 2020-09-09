package practice.leecode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount_454 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        Map<Integer, Integer> prev = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                int sum = a + b;
                prev.put(sum, prev.getOrDefault(sum, 0) + 1);
            }
        }
        for (int c : C) {
            for (int d : D) {
                int sum = - (c + d);
                res += prev.getOrDefault(sum, 0);
            }
        }
        return res;
    }

}
