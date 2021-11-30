package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxCount_598Test {

    @Test
    public void maxCount_1() {
        int m = 3, n = 3;
        int[][] operations = {{2,2},{3,3}};
        assertEquals(4, new MaxCount_598().maxCount(m, n, operations));
    }

    @Test
    public void maxCount_2() {
        int m = 3, n = 3;
        int[][] operations = {};
        assertEquals(9, new MaxCount_598().maxCount(m, n, operations));
    }

}