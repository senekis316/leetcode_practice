package practice.leecode.Arrays;

import java.util.Arrays;

public class ThreeSumClosest_16 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) return sum;
                int abs = Math.abs(sum - target);
                if (abs < best) {
                    best = abs;
                    res = sum;
                }
                best = Math.min(Math.abs(sum - target), best);
                if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return res;
    }

}
