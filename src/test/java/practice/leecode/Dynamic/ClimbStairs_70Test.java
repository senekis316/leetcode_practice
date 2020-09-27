package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbStairs_70Test {

    @Test
    public void climbStairs_1() {
        ClimbStairs_70 climbStairs_70 = new ClimbStairs_70();
        assertEquals(2, climbStairs_70.climbStairs(2));
    }

    @Test
    public void climbStairs_2() {
        ClimbStairs_70 climbStairs_70 = new ClimbStairs_70();
        assertEquals(3, climbStairs_70.climbStairs(3));
    }

}