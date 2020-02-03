package practice.leecode.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumSmallerByFrequency_1170 {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] nums1 = numSmallerByFrequency(queries);
        int[] nums2 = numSmallerByFrequency(words);
        Arrays.sort(nums2);
        return numSmallerByFrequency(nums1, nums2);
    }

    private int[] numSmallerByFrequency(String[] strings) {
        int[] nums = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            int count = 1;
            char[] chars = strings[i].toCharArray();
            char ch = chars[0];
            for (int j = 1; j < chars.length; j++) {
                if (ch == chars[j]) {
                    count++;
                } else {
                    if (ch > chars[j]) {
                        ch = chars[j];
                        count = 1;
                    }
                }
            }
            nums[i] = count;
        }
        return nums;
    }

    private int[] numSmallerByFrequency(int[] nums1, int[] nums2) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int num = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] < nums2[j]) {
                   num = nums2.length - j;
                   break;
                }
            }
            nums.add(num);
        }
        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}
