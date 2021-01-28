package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class PivotIndex_724Test {

    @Test
    public void pivotIndex_1() {
        PivotIndex_724 pivotIndex_724 = new PivotIndex_724();
        assertEquals(3, pivotIndex_724.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    public void pivotIndex_2() {
        PivotIndex_724 pivotIndex_724 = new PivotIndex_724();
        assertEquals(-1, pivotIndex_724.pivotIndex(new int[]{1, 2, 3}));
    }

    @Test
    public void pivotIndex_3() {
        PivotIndex_724 pivotIndex_724 = new PivotIndex_724();
        assertEquals(0, pivotIndex_724.pivotIndex(new int[]{-1, -1, -1, 0, 1, 1}));
    }

}