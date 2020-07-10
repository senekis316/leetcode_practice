package practice.leecode.Arrays;

public class MaximumGap_164 {

    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        quick_sort(0, nums.length - 1, nums);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, nums[i + 1] - nums[i]);
        }
        return max;
    }

    private void quick_sort(int l, int r, int[] nums) {
        if (l < r) {
            int i = l, j = r, m = nums[l];
            while (i < j) {
                while (i < j && nums[j] >= m) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while (i < j && nums[i] < m) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = m;
            quick_sort(l, i - 1, nums);
            quick_sort(i + 1, r, nums);
        }
    }

}
