package practice.leecode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray_697 {

    public int findShortestSubArray(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        int count;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            count = countMap.getOrDefault(nums[i], 0) + 1;
            max = max > count ? max : count;
            countMap.put(nums[i], count);
            if (left.get(nums[i]) == null) {
                left.put(nums[i], i);
            } else {
                right.put(nums[i], i);
            }
        }
        if (max == 1) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == max) {
                min = Math.min(min, right.get(entry.getKey()) - left.get(entry.getKey()) + 1);
            }
        }
        return min;
    }

}
