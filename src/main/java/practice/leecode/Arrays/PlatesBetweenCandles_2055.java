package practice.leecode.Arrays;

import java.util.Arrays;

public class PlatesBetweenCandles_2055 {

    public int[] platesBetweenCandles(String s, int[][] queries) {
        int sum = 0;
        int[] cache = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                sum++;
            }
            cache[i] = sum;
        }

        int[] left = new int[s.length()];
        for (int i = s.length() - 1, val = -1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                val = i;
            }
            left[i] = val;
        }

        int[] right = new int[s.length()];
        for (int i = 0, val = -1; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                val = i;
            }
            right[i] = val;
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int lb = left[queries[i][0]];
            int rb = right[queries[i][1]];
            res[i] = lb >= rb || lb == -1 || rb == -1 ? 0 : cache[rb] - cache[lb];
        }
        return res;
    }

}
