package practice.leecode.HashMap;

import org.junit.Test;

import static org.junit.Assert.*;

public class FourSumCount_454Test {

    @Test
    public void fourSumCount() {
        int[] A = new int[]{1,2};
        int[] B = new int[]{-2,-1};
        int[] C = new int[]{-1,2};
        int[] D = new int[]{0,2};
        FourSumCount_454 fourSumCount_454 = new FourSumCount_454();
        assertEquals(2, fourSumCount_454.fourSumCount(A,B,C,D));
    }

}