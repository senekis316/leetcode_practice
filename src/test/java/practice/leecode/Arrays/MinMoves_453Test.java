package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinMoves_453Test {

    @Test
    public void minMoves_1() {
        MinMoves_453 minMoves_453 = new MinMoves_453();
        assertEquals(3, minMoves_453.minMoves(new int[]{1,2,3}));
    }

    @Test
    public void minMoves_2() {
        MinMoves_453 minMoves_453 = new MinMoves_453();
        assertEquals(0, minMoves_453.minMoves(new int[]{1,1,1}));
    }

    @Test
    public void minMoves_3() {
        MinMoves_453 minMoves_453 = new MinMoves_453();
        assertEquals(487, minMoves_453.minMoves(new int[]{83,86,77,15,93,35,86,92,49,21}));
    }

}