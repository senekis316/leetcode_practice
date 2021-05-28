package practice.leecode.Arrays;

public class TotalHammingDistance_477 {

    public int totalHammingDistance(int[] nums) {
        int ans = 0, n = nums.length;
        for (int x = 0; x <= 31; x++) {
            int ones = 0;
            for (int num : nums) {
                ones += (num >> x & 1);
            }
            ans += ones * (n - ones);
        }
        return ans;
    }

}
