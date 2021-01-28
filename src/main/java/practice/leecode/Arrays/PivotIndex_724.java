package practice.leecode.Arrays;

public class PivotIndex_724 {

    public int pivotIndex(int[] nums) {
        int sum1 = 0;
        for (int num : nums) {
            sum1 += num;
        }
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i >= 1) {
                sum2 += nums[i - 1];
            }
            if (sum2 == sum1 - sum2 - nums[i]) {
                return i;
            }
        }
        return -1;
    }

}
