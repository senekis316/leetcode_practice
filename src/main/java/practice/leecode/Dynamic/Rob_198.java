package practice.leecode.Dynamic;

public class Rob_198 {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }


//    private int[] nums;
//
//    public int rob(int[] nums) {
//        this.nums = nums;
//        return rob(nums.length - 1);
//    }
//
//    public int rob(int r) {
//        if (r == 0) return nums[r];
//        if (r == 1) return Math.max(nums[0], nums[1]);
//
//        return Math.max(nums[r] + rob(r - 2), rob(r - 1));
//    }

    // 方法一: 递归
    /*public int rob(int[] nums) {
        return rob(nums, nums.length - 1);
    }

    private int rob(int[] nums, int last) {
        if (last == 0 || last == 1) {
            return nums[last];
        }
        int sum1 = rob(nums, last - 1);
        int sum2 = rob(nums, last - 2) + nums[last];
        return Math.max(sum1, sum2);
    }*/

}
