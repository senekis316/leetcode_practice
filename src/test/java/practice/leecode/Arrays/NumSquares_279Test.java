package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumSquares_279Test {

    @Test
    public void numSquares_1() {
        NumSquares_279 numSquares_279 = new NumSquares_279();
        assertEquals(3, numSquares_279.numSquares(12));
    }

    @Test
    public void numSquares_2() {
        NumSquares_279 numSquares_279 = new NumSquares_279();
        assertEquals(2, numSquares_279.numSquares(13));
    }

}