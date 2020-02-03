package practice.leecode.Sort;

public class LargestPerimeter_976 {

    public int largestPerimeter(int[] nums) {
        int max = 0;
        quick_sort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length - 2; i++) {
            if (isTriangle(nums[i], nums[i + 1], nums[i + 2])) {
                return nums[i] + nums[i + 1] + nums[i + 2];
            }
        }
        return 0;
    }

    private boolean isTriangle(int num1, int num2, int num3) {
        if (num2 + num3 > num1) {
            return true;
        }
        return false;
    }

    private void quick_sort(int[] nums, int l , int r) {
        if (l < r) {
            int i = l, j = r, m = nums[l];
            while(i < j) {
                while(i < j && nums[j] <= m) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while(i < j && nums[i] > m) {
                    i++;
                }
                if(i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = m;
            quick_sort(nums, l, i - 1);
            quick_sort(nums, i + 1, r);
        }
    }

}
