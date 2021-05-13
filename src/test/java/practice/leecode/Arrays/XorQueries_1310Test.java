package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class XorQueries_1310Test {

    @Test
    public void xorQueries_1() {
        int[] arr = new int[]{1,3,4,8};
        int[][] queries = new int[][]{{0,1},{1,2},{0,3},{3,3}};
        int[] expect = new int[]{2,7,14,8};
        XorQueries_1310 xorQueries_1310 = new XorQueries_1310();
        assertArrayEquals(expect, xorQueries_1310.xorQueries(arr, queries));
    }

    @Test
    public void xorQueries_2() {
        int[] arr = new int[]{4,8,2,10};
        int[][] queries = new int[][]{{2,3},{1,3},{0,0},{0,3}};
        int[] expect = new int[]{8,0,4,4};
        XorQueries_1310 xorQueries_1310 = new XorQueries_1310();
        assertArrayEquals(expect, xorQueries_1310.xorQueries(arr, queries));
    }

}