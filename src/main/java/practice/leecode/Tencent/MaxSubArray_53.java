package practice.leecode.Tencent;

public class MaxSubArray_53 {

    public int maxSubArray(int[] nums) {

        int sum = 0;
        int res = nums[0];

        for(int num : nums) {
            sum = sum > 0 ? sum + num : num;
            res = res >= sum ? res : sum;
        }

        return res;

    }

}
