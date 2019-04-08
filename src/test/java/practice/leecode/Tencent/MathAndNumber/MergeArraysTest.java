package practice.leecode.Tencent.MathAndNumber;

import org.junit.Test;
import practice.leecode.Tencent.LinkedTable.MergeArrays;

import static org.junit.Assert.*;

public class MergeArraysTest {

    @Test
    public void merge() {

        merge1();
        merge2();
        merge3();
        merge4();

    }

    @Test
    public void merge1() {

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        MergeArrays mergeArrays = new MergeArrays();
        mergeArrays.merge(nums1, m, nums2, n);

        int[] num3 = {1,2,2,3,5,6};

        assertArrayEquals(num3, nums1);

    }

    @Test
    public void merge2() {

        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
        int[] nums2 = {1,2,2};
        int m = 6;
        int n = 3;

        MergeArrays mergeArrays = new MergeArrays();
        mergeArrays.merge(nums1, m, nums2, n);

        int[] num3 = {-1,0,0,1,2,2,3,3,3};

        assertArrayEquals(num3, nums1);

    }

    @Test
    public void merge3() {

        int[] nums1 = {1,3,0,0,0,0};
        int[] nums2 = {2,5,6,7};
        int m = 2;
        int n = 4;

        MergeArrays mergeArrays = new MergeArrays();
        mergeArrays.merge(nums1, m, nums2, n);

        int[] num3 = {1,2,3,5,6,7};

        assertArrayEquals(num3, nums1);

    }

    @Test
    public void merge4() {

        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;

        MergeArrays mergeArrays = new MergeArrays();
        mergeArrays.merge(nums1, m, nums2, n);

        int[] num3 = {1};

        assertArrayEquals(num3, nums1);

    }

}