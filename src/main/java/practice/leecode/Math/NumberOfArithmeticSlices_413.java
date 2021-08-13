package practice.leecode.Math;


public class NumberOfArithmeticSlices_413 {

    public int numberOfArithmeticSlices(int[] nums) {
        int ans = 0;
        if (nums.length < 3) return ans;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 2; j < nums.length; j++) {
                if (nums[j] - nums[j - 1] != nums[j - 1] - nums[j - 2]) {
                    break;
                }
                ans++;
            }
        }
        return ans;
    }

}
