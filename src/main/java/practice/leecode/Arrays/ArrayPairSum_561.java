package practice.leecode.Arrays;

public class ArrayPairSum_561 {

    public int arrayPairSum(int[] nums) {
        quick_sort(nums, 0, nums.length - 1);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }

    private void quick_sort(int[] nums, int l, int r) {
        if (l < r) {
            int i = l, j = r;
            int m = nums[l];
            while(i < j) {
                while(i < j && nums[j] >= m) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while(i < j && nums[i] < m) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = m;
            quick_sort(nums, l, i - 1);
            quick_sort(nums, i + 1, r);
        }
    }

}
