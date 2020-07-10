package practice.leecode.Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllCellsDistOrder_1030Test {

    @Test
    public void allCellsDistOrder_1() {
        int R = 1, C = 2, r0 = 0, c0 = 0;
        AllCellsDistOrder_1030 AllCellsDistOrder_1030 = new AllCellsDistOrder_1030();
        int[][] result = AllCellsDistOrder_1030.allCellsDistOrder(1,2,0,0);
        assertArrayEquals(new int[]{0, 0}, result[0]);
        assertArrayEquals(new int[]{0, 1}, result[1]);
    }

    @Test
    public void allCellsDistOrder_2() {
        int R = 2, C = 2, r0 = 0, c0 = 1;
        AllCellsDistOrder_1030 AllCellsDistOrder_1030 = new AllCellsDistOrder_1030();
        int[][] result = AllCellsDistOrder_1030.allCellsDistOrder(2,2,0,1);
        assertArrayEquals(new int[]{0, 1}, result[0]);
        assertArrayEquals(new int[]{0, 0}, result[1]);
        assertArrayEquals(new int[]{1, 1}, result[2]);
        assertArrayEquals(new int[]{1, 0}, result[3]);
    }

    @Test
    public void allCellsDistOrder_3() {
        int R = 2, C = 3, r0 = 1, c0 = 2;
        AllCellsDistOrder_1030 AllCellsDistOrder_1030 = new AllCellsDistOrder_1030();
        int[][] result = AllCellsDistOrder_1030.allCellsDistOrder(2,3,1,2);
        assertArrayEquals(new int[]{1, 2}, result[0]);
        assertArrayEquals(new int[]{0, 2}, result[1]);
        assertArrayEquals(new int[]{1, 1}, result[2]);
        assertArrayEquals(new int[]{0, 1}, result[3]);
        assertArrayEquals(new int[]{1, 0}, result[4]);
        assertArrayEquals(new int[]{0, 0}, result[5]);
    }
}