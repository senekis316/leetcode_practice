package practice.leecode.HashMap;

import java.util.HashSet;
import java.util.Set;

public class Intersection_349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num: nums1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int num: nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        Integer[] nums = set2.toArray(new Integer[set2.size()]);
        int[] res = new int[set2.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = nums[i];
        }
        return res;
    }

}
