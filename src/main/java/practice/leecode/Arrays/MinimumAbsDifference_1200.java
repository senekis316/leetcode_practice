package practice.leecode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsDifference_1200 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        quick_sort(arr, 0, arr.length - 1);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int sub = arr[i + 1] - arr[i];
            if (sub <= min) {
                if (sub < min) {
                    min = sub;
                    res.clear();
                }
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                res.add(pair);
            }
        }
        return res;
    }

    private void quick_sort(int[] nums, int l, int r) {
        if (l < r) {
            int i = l, j = r, m = nums[l];
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
