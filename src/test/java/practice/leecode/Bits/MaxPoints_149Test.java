package practice.leecode.Bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxPoints_149Test {

    @Test
    public void maxPoints() {
        MaxPoints_149 maxPoints_149 = new MaxPoints_149();
        assertEquals(3, maxPoints_149.maxPoints(new int[][]{{1,1},{2,2},{3,3}}));
        assertEquals(4, maxPoints_149.maxPoints(new int[][]{{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}}));
    }

}