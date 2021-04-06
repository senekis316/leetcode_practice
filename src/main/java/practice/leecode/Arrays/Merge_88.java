package practice.leecode.Arrays;

public class Merge_88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (p1 == -1) {
                nums1[i] = nums2[p2--];
            } else if (p2 == -1) {
                nums1[i] = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1--];
            } else {
                nums1[i] = nums2[p2--];
            }
        }
    }

}
