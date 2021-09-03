package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestK_17_14Test {

    @Test
    public void smallestK() {
        int k = 4;
        int[] arr = new int[]{1,3,5,7,2,4,6,8};
        SmallestK_17_14 smallestK_17_14 = new SmallestK_17_14();
        assertArrayEquals(new int[]{1,2,3,4}, smallestK_17_14.smallestK(arr, k));
    }

}