package practice.leecode.Window;

import java.util.HashMap;
import java.util.Map;

public class SubArraysWithKDistinct_992 {

    public int subArraysWithKDistinct(int[] A, int K) {
        int idx = 0;
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            if (map.size() == K) {
                cnt++;
            }
            boolean move = map.size() > K && idx <= i;
            while (map.size() > K && idx <= i) {
                if (map.get(A[i]) == 1) {
                    map.remove(A[i]);
                } else {
                    map.put(A[idx], map.get(A[i]) - 1);
                }
            }
            if (move && map.size() == K) {
                cnt++;
            }
        }
        return cnt;
    }

}
