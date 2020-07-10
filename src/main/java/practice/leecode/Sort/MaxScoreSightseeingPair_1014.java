package practice.leecode.Sort;

public class MaxScoreSightseeingPair_1014 {

    public int maxScoreSightseeingPair(int[] A) {
        int ans = 0, mx = A[0];
        for (int i = 1; i < A.length; i++) {
            ans = Integer.max(ans, mx + A[i] - i);
            mx = Integer.max(mx, A[i] + i);
        }
        return ans;
    }

}
