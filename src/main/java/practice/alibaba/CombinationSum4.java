package practice.alibaba;

import java.util.Arrays;

public class CombinationSum4 {

    private int count;

    public int combinationSum4(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        combinationSum(nums, target);
        return count;
    }

    private void combinationSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                combinationSum(nums, target - nums[i]);
            } else if (nums[i] == target) {
                count++;
            } else {
                break;
            }
        }
    }

}
