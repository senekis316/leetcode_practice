package practice.leecode.Arrays;

public class GetMaximumGenerated_1646 {

    public int getMaximumGenerated(int n) {
        int max = Integer.MIN_VALUE;
        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nums[i] = i;
        }
        for (int i = 0; i <= n; i++) {
            if (i * 2 <= n) {
                nums[i * 2] = nums[i];
            }
            if (i * 2 + 1 <= n) {
                nums[i * 2 + 1] = nums[i] + nums[i + 1];
            }
        }
        for (int i = 0; i <= n; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }

}
