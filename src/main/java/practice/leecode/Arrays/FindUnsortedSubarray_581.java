package practice.leecode.Arrays;

public class FindUnsortedSubarray_581 {

    public int findUnsortedSubarray(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j && nums[i] <= nums[i + 1]) i++;
        while (i < j && nums[j] >= nums[j - 1]) j--;
        if (i == j) return 0;
        int min = nums[i], max = nums[j];
        for (int l = i; l <= j; l++) {
            min = Math.min(min, nums[l]);
            max = Math.max(max, nums[l]);
        }
        while (i > 0 && nums[i - 1] > min) {
            i--;
        }
        while (j < nums.length - 1 && nums[j + 1] < max) {
            j++;
        }
        return j - i + 1;
    }

}
