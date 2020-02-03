package practice.leecode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPerfectSquare_367Test {

    @Test
    public void isPerfectSquare() {
        IsPerfectSquare_367 isPerfectSquare_367 = new IsPerfectSquare_367();
        assertEquals(true, isPerfectSquare_367.isPerfectSquare(16));
        assertEquals(false, isPerfectSquare_367.isPerfectSquare(14));
        assertEquals(true, isPerfectSquare_367.isPerfectSquare(808201));
    }
}