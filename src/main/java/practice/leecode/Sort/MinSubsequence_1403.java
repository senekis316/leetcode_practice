package practice.leecode.Sort;

import java.util.ArrayList;
import java.util.List;

public class MinSubsequence_1403 {

    public List<Integer> minSubsequence(int[] nums) {
        quick_sort(0, nums.length - 1, nums);
        int all = sum(nums);
        int sub = 0;
        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (sub > all) {
                return sequence;
            } else {
                sequence.add(nums[i]);
                all -= sequence.get(i);
                sub += sequence.get(i);
            }
        }
        return sequence;
    }

    private void quick_sort(int l, int r, int[] nums) {
        if (l < r) {
            int i = l, j = r, m = nums[l];
            while(i < j) {
                while(i < j && m >= nums[j]) {
                    j--;
                }
                if (i < j) {
                    nums[i] = nums[j];
                }
                while(i < j && m < nums[i]) {
                    i++;
                }
                if (i < j) {
                    nums[j] = nums[i];
                }
            }
            nums[i] = m;
            quick_sort(l, i-1, nums);
            quick_sort(i + 1, r, nums);
        }
    }

    private int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

}
