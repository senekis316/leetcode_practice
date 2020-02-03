package practice.leecode.Arrays;

public class HeightChecker_1051 {

    public int heightChecker(int[] heights) {
        int[] orders = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            orders[i] = heights[i];
        }
        quick_sort(orders, 0, orders.length - 1);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != orders[i]) {
                count++;
            }
        }
        return count;
    }

    private void quick_sort(int[] nums, int l, int r) {
        if (l < r) {
            int i = l, j = r, m = nums[l];
            while(i < j) {
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
            quick_sort(nums, l, i - 1);
            quick_sort(nums, i + 1, r);
        }
    }

}
