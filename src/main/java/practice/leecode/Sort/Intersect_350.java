package practice.leecode.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersect_350 {

    // 哈希法
    /*public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            numMap.put(nums1[i], numMap.getOrDefault(nums1[i], 0) + 1);
        }
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            int count = numMap.getOrDefault(nums2[i], 0);
            if (count > 0) {
                nums.add(nums2[i]);
                numMap.put(nums2[i], count - 1);
            }
        }
        int[] res = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            res[i] = nums.get(i);
        }
        return res;
    }*/

    // 排序法
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> nums = new ArrayList();
        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                nums.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] res = new int[nums.size()];
        for (i = 0; i < res.length; i++) {
            res[i] = nums.get(i);
        }
        return res;
    }

}
