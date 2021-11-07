package practice.leecode.Arrays;

public class MissingNumber_268 {

    public int missingNumber(int[] nums) {
        int sum1 = nums.length + nums.length * (nums.length - 1) / 2;
        int sum2 = 0;
        for (int num : nums) {
            sum2 += num;
        }
        return sum1 - sum2;
    }

}
