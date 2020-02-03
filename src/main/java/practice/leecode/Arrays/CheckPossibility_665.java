package practice.leecode.Arrays;

public class CheckPossibility_665 {

    Integer count = 0;

    public boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int tmp = nums[i];
                if (i >= 1) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i] = nums[i + 1];
                }
                if (nums[i] > nums[i + 1]) {
                    nums[i] = tmp;
                    nums[i + 1] = nums[i];
                }
                cnt++;
                if (cnt == 2) {
                    return false;
                }
            }
        }
        return true;
    }

    private void quick_sort(int[] nums, int l, int r) {
        if (l < r) {
            int i = l, j = r;
            int m = nums[l];
            while(i < j) {
                while(i < j && m <= nums[j]) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                    count++;
                }
                while(i < j && m >= nums[i]) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                    count++;
                }
            }
            if (i != l) {
                nums[i] = m;
                count++;
            }
            quick_sort(nums, l, i - 1);
            quick_sort(nums, i + 1, r);
        }
    }

}
