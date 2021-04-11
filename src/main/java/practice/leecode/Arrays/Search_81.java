package practice.leecode.Arrays;

public class Search_81 {

    public boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return true;
            if (nums[i] > target) {
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) return true;
            if (nums[i] < target) {
                break;
            }
        }
        return false;
    }

}
