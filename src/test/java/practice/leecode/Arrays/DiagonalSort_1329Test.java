package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiagonalSort_1329Test {

    @Test
    public void diagonalSort_1() {
        int[][] mat = {
            {3,3,1,1},
            {2,2,1,2},
            {1,1,1,2}
        };
        int[][] res = {
            {1,1,1,1},
            {1,2,2,2},
            {1,2,3,3}
        };
        DiagonalSort_1329 DiagonalSort_1329 = new DiagonalSort_1329();
        DiagonalSort_1329.diagonalSort(mat);
        assertArrayEquals(res, mat);
    }

}