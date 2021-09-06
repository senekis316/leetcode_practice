package practice.leecode.Arrays;

public class Search_704 {

    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int l, int r) {
        int m = (l + r) / 2;
        if (nums[m] == target) {
            return m;
        }
        if (l == r) {
            return -1;
        }
        if (nums[m] >= target) {
            return search(nums, target, l, m);
        } else {
            return search(nums, target, m + 1, r);
        }
    }

}
