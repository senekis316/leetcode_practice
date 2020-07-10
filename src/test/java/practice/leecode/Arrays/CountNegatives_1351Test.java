package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountNegatives_1351Test {

    @Test
    public void countNegatives_1() {
        int[][] grid = new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        CountNegatives_1351 CountNegatives_1351 = new CountNegatives_1351();
        assertEquals(8, CountNegatives_1351.countNegatives(grid));
    }

    @Test
    public void countNegatives_2() {
        int[][] grid = new int[][]{{3,2},{1,0}};
        CountNegatives_1351 CountNegatives_1351 = new CountNegatives_1351();
        assertEquals(0, CountNegatives_1351.countNegatives(grid));
    }

    @Test
    public void countNegatives_3() {
        int[][] grid = new int[][]{{1,-1},{-1,-1}};
        CountNegatives_1351 CountNegatives_1351 = new CountNegatives_1351();
        assertEquals(3, CountNegatives_1351.countNegatives(grid));
    }

    @Test
    public void countNegatives_4() {
        int[][] grid = new int[][]{{-1}};
        CountNegatives_1351 CountNegatives_1351 = new CountNegatives_1351();
        assertEquals(1, CountNegatives_1351.countNegatives(grid));
    }

}