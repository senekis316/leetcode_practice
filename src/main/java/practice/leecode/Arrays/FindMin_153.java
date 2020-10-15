package practice.leecode.Arrays;

public class FindMin_153 {

    public int findMin(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return nums[i];
            }
        }
        return nums[0];
    }

}
