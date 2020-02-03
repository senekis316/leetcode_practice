package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class RelativeSortArray_1122Test {

    @Test
    public void relativeSortArray_1() {
        int[] arr1 = new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = new int[]{2,1,4,3,9,6};
        int[] res = new int[]{2,2,2,1,4,3,3,9,6,7,19};
        RelativeSortArray_1122 RelativeSortArray_1122 = new RelativeSortArray_1122();
        assertArrayEquals(res, RelativeSortArray_1122.relativeSortArray(arr1, arr2));
    }

    @Test
    public void relativeSortArray_2() {
        int[] arr1 = new int[]{28,6,22,8,44,17};
        int[] arr2 = new int[]{22,28,8,6};
        int[] res = new int[]{22,28,8,6,17,44};
        RelativeSortArray_1122 RelativeSortArray_1122 = new RelativeSortArray_1122();
        assertArrayEquals(res, RelativeSortArray_1122.relativeSortArray(arr1, arr2));
    }

    @Test
    public void relativeSortArray_3() {
        int[] arr1 = new int[]{26,21,11,20,50,34,1,18};
        int[] arr2 = new int[]{21,11,26,20};
        int[] res = new int[]{21,11,26,20,1,18,34,50};
        RelativeSortArray_1122 RelativeSortArray_1122 = new RelativeSortArray_1122();
        assertArrayEquals(res, RelativeSortArray_1122.relativeSortArray(arr1, arr2));
    }

    @Test
    public void relativeSortArray_4() {
        int[] arr1 = new int[]{943,790,427,722,860,550,225,846,715,320};
        int[] arr2 = new int[]{943,715,427,790,860,722,225,320,846,550};
        int[] res = new int[]{943,715,427,790,860,722,225,320,846,550};
        RelativeSortArray_1122 RelativeSortArray_1122 = new RelativeSortArray_1122();
        assertArrayEquals(res, RelativeSortArray_1122.relativeSortArray(arr1, arr2));
    }

}