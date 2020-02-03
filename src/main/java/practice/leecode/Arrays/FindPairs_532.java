package practice.leecode.Arrays;

import java.util.*;

public class FindPairs_532 {

    public int findPairs(int[] nums, int k) {
        Set<Integer> orig = new HashSet<>();
        Set<Integer> diff = new HashSet<>();
        for (int num: nums) {
            if (orig.contains(num - k)) {
                diff.add(num - k);
            }
            if (orig.contains(num + k)) {
                diff.add(num);
            }
            orig.add(num);
        }
        return diff.size();
    }

    private void quick_sort(int nums[], int l, int r) {

        if (l < r) {

            int i = l;
            int j = r;

            while(i < j) {

                while(i < j && nums[j] >= nums[l]) {
                    j--;
                }

                while(i < j && nums[i] <= nums[l]) {
                    i++;
                }

            }

            if (l != i) {
                nums[l] = nums[i] ^ nums[l];
                nums[i] = nums[i] ^ nums[l];
                nums[l] = nums[i] ^ nums[l];
            }

            quick_sort(nums, l, i - 1);
            quick_sort(nums,i + 1, r);

        }
    }



}
