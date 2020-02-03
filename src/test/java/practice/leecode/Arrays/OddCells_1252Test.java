package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddCells_1252Test {

    @Test
    public void oddCells_1() {
        OddCells_1252 OddCells_1252 = new OddCells_1252();
        assertEquals(6, OddCells_1252.oddCells(2, 3, new int[][]{{0,1},{1,1}}));
    }

    @Test
    public void oddCells_2() {
        OddCells_1252 OddCells_1252 = new OddCells_1252();
        assertEquals(0, OddCells_1252.oddCells(2, 2, new int[][]{{1,1},{0,0}}));
    }
}