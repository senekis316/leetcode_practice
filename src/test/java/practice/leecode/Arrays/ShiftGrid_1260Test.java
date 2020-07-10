package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShiftGrid_1260Test {

    @Test
    public void shiftGrid() {
        int k = 1;
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        ShiftGrid_1260 ShiftGrid_1260 = new ShiftGrid_1260();
        ShiftGrid_1260.shiftGrid(grid, k);
    }
}