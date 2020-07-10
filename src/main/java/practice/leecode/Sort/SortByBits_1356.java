package practice.leecode.Sort;

import java.util.ArrayList;
import java.util.List;

public class SortByBits_1356 {

    public int[] sortByBits(int[] arr) {
        List<List<Integer>> numList = new ArrayList<>(15);
        for (int i = 0; i < 15; i++) {
            numList.add(new ArrayList<>());
        }
        quick_sort(arr, 0, arr.length - 1);
        for (int num : arr) {
            int count = 0;
            int temp = num;
            while (temp != 0) {
                if (temp % 2 == 1) {
                    count++;
                }
                temp = temp >>> 1;
            }
            List<Integer> nums = numList.get(count);
            nums.add(num);
        }
        int[] sort = new int[arr.length];
        int j = 0;
        for (int i = 0; i < numList.size(); i++) {
            List<Integer> nums = numList.get(i);
            for (int num: nums) {
                sort[j++] = num;
            }
        }
        return sort;
    }

    public void quick_sort(int[] nums, int l, int r) {
        if (l < r) {
            int i = l, j = r, m = nums[l];
            while (i < j) {
                while (i < j && m <= nums[j]) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while (i < j && m > nums[i]) {
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
