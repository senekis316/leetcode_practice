package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class Merge_88Test {

    @Test
    public void merge_1() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int[] expect = new int[]{1,2,2,3,5,6};
        Merge_88 merge_88 = new Merge_88();
        merge_88.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expect, nums1);
    }

    @Test
    public void merge_2() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        int[] expect = new int[]{1};
        Merge_88 merge_88 = new Merge_88();
        merge_88.merge(nums1, 1, nums2, 0);
        assertArrayEquals(expect, nums1);
    }

    @Test
    public void merge_3() {
        int[] nums1 = new int[]{2, 0};
        int[] nums2 = new int[]{1};
        int[] expect = new int[]{1,2};
        Merge_88 merge_88 = new Merge_88();
        merge_88.merge(nums1, 1, nums2, 1);
        assertArrayEquals(expect, nums1);
    }

    @Test
    public void merge_4() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int[] expect = new int[]{1};
        Merge_88 merge_88 = new Merge_88();
        merge_88.merge(nums1, 0, nums2, 1);
        assertArrayEquals(expect, nums1);
    }

    @Test
    public void merge_5() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int[] expect = new int[]{1};
        Merge_88 merge_88 = new Merge_88();
        merge_88.merge(nums1, 0, nums2, 1);
        assertArrayEquals(expect, nums1);
    }

//
//    [-1,0,0,3,3,3,0,0,0]
//        6
//        [1,2,2]
//        3

}