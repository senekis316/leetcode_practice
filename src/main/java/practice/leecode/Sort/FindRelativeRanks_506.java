package practice.leecode.Sort;

import java.util.HashMap;
import java.util.Map;

public class FindRelativeRanks_506 {

    private Map<Integer, Integer> map = new HashMap<>();

    public String[] findRelativeRanks(int[] nums) {
        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);
        quick_sort(copy, 0, copy.length - 1);
        for (int i = 0; i < copy.length; i++) {
            map.put(copy[i], i + 1);
        }
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int rank = map.get(nums[i]);
            if (rank == 1) {
                strs[i] = "Gold Medal";
            } else if (rank == 2) {
                strs[i] = "Silver Medal";
            } else if (rank == 3) {
                strs[i] = "Bronze Medal";
            } else {
                strs[i] = String.valueOf(rank);
            }
        }
        return strs;
    }

    private void quick_sort(int[] nums, int l, int r) {
        if (l < r) {
            int i = l, j = r,  m = nums[l];
            while (i < j) {
                while (i < j && m >= nums[j]) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while (i < j && m < nums[i]) {
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
