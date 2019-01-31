package practice.leecode.qq;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = (m > 0 ? m-- : m) + n-- - 1;
        while (m >= 0 && n >= 0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
    }

    /*public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> nums3 = IntStream.of(Arrays.copyOf(nums1, m)).boxed().collect(Collectors.toList());
        nums3.addAll(IntStream.of(nums2).boxed().collect(Collectors.toList()));
        int[] nums4 = nums3.stream().mapToInt(i->i).sorted().toArray();
        for (int i=0; i<nums4.length; i++) {
            nums1[i] = nums4[i];
        }
    }*/

}
