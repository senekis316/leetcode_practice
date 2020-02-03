package practice.leecode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array_NextGreaterElement_496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] nums3 = new int[nums2.length];

        System.arraycopy(nums2, 0, nums3, 0, nums2.length);

        Arrays.sort(nums3);

        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) {
            indexMap.put(nums2[i], i);
        }

        int[] result = new int[nums1.length];
        for (int i=0; i < result.length; i++) {
            result[i] = -1;
        }

        for (int i=0; i < nums1.length; i++) {
            if ((nums1[i] < nums3[nums3.length-1])){
                for(int j = indexMap.get(nums1[i]); j < nums2.length; j++) {
                    if (nums2[j] > nums1[i]) {
                        result[i] = nums2[j];
                        break;
                    }
                }
            }
        }

        return result;

    }

}
