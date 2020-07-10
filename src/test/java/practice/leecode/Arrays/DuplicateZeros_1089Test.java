package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicateZeros_1089Test {

    @Test
    public void duplicateZeros_1() {
        int[] arr = new int[]{1,0,2,3,0,4,5,0};
        //int[] res = new int[]{1,0,0,2,3,0,0,4};
        DuplicateZeros_1089 DuplicateZeros_1089 = new DuplicateZeros_1089();
        int[] res = DuplicateZeros_1089.duplicateZeros(arr);
        assertArrayEquals(res, arr);
    }

    @Test
    public void duplicateZeros_2() {
        int[] arr = new int[]{1,2,3};
        //int[] res = new int[]{1,2,3};
        DuplicateZeros_1089 DuplicateZeros_1089 = new DuplicateZeros_1089();
        int[] res = DuplicateZeros_1089.duplicateZeros(arr);
        assertArrayEquals(res, arr);
    }

}