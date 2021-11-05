package practice.leecode.Arrays;

import java.util.Map;
import java.util.HashMap;

public class LongestSubsequence_1218 {

    public int longestSubsequence(int[] arr, int difference) {
        int ans = 0;
        Map<Integer, Integer> dp = new HashMap<>();
        for (int val : arr) {
            dp.put(val, dp.getOrDefault(val - difference, 0) + 1);
            ans = Math.max(ans, dp.get(val));
        }
        return ans;
    }

}
