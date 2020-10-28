package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumMatrix_304Test {

    @Test
    public void sumRegion() {
        int[][] matrix = new int[][] {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}};
        NumMatrix_304 numMatrix_304 = new NumMatrix_304(matrix);
        assertEquals(8, numMatrix_304.sumRegion(2,1, 4, 3));
        assertEquals(11, numMatrix_304.sumRegion(1,1, 2, 2));
        assertEquals(12, numMatrix_304.sumRegion(1,2, 2, 4));
    }

}