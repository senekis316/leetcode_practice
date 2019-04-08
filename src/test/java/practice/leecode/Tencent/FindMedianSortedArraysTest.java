package practice.leecode.qq;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMedianSortedArraysTest {

    @Test
    public void findMedianSortedArrays() {

        FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        assertEquals(2.0, findMedianSortedArrays.findMedianSortedArrays(nums1, nums2), 0.0);

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        assertEquals(2.5, findMedianSortedArrays.findMedianSortedArrays(nums3, nums4), 0.0);

    }
}