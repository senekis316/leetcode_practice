package practice.leecode.qq;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbStairsTest {

    @Test
    public void climbStairs() {

        ClimbStairs climbStairs = new ClimbStairs();
        assertEquals(1, climbStairs.climbStairs(1));
        assertEquals(2, climbStairs.climbStairs(2));
        assertEquals(3, climbStairs.climbStairs(3));

    }
}