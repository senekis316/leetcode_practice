package practice.leecode.Dynamic;

public class Rob_213 {

    private int[] dp;
    private int[] nums;

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        this.nums = nums;
        this.dp = new int[nums.length];
        return Math.max(rob(0, nums.length - 2), rob(1, nums.length - 1));
    }

    private int rob(int l, int r) {
        dp[l] = nums[l];
        dp[l + 1] = Math.max(nums[l], nums[l + 1]);
        for (int i = l + 2; i <= r; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[r];
    }

}
