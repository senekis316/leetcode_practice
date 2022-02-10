package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ColorBorder_1034Test {

    @Test
    public void colorBorder_1() {
        int row = 0, col = 0, color = 3;
        int[][] grid = new int[][]{{1,1},{1,2}};
        int[][] expect = new int[][]{{3,3},{2,2}};
        int[][] actual = new ColorBorder_1034().colorBorder(grid, row, col, color);
        assertArrayEquals(expect, actual);
    }

    @Test
    public void colorBorder_2() {
        int row = 0, col = 1, color = 3;
        int[][] grid = new int[][]{{1,2,2},{2,3,2}};
        int[][] expect = new int[][]{{1,3,3},{2,3,3}};
        int[][] actual = new ColorBorder_1034().colorBorder(grid, row, col, color);
        assertArrayEquals(expect, actual);
    }

    @Test
    public void colorBorder_3() {
        int row = 1, col = 1, color = 2;
        int[][] grid = new int[][]{{1,1,1},{1,1,1},{1,1,1}};
        int[][] expect = new int[][]{{2,2,2},{2,1,2},{2,2,2}};
        int[][] actual = new ColorBorder_1034().colorBorder(grid, row, col, color);
        assertArrayEquals(expect, actual);
    }

}