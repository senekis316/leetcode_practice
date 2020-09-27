package practice.leecode.Dynamic;

public class Rob_198 {

    //{3,2,9,3,1}
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[1];
        int sum1 = nums[0];
        int sum2 = nums[1];
        for (int i = 2; i < nums.length; i++) {
            int tmp = sum1;
            sum1 = sum1 > sum2 ? sum1 : sum2;
            sum2 = tmp + nums[i];
        }
        return sum1 > sum2 ? sum1 : sum2;
    }

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
