package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinTimeToVisitAllPoints_1266Test {

    @Test
    public void minTimeToVisitAllPoints_1() {
        int[][] points = {{1,1},{3,4},{-1,0}};
        MinTimeToVisitAllPoints_1266 minTimeToVisitAllPoints_1266 = new MinTimeToVisitAllPoints_1266();
        assertEquals(7, minTimeToVisitAllPoints_1266.minTimeToVisitAllPoints(points));
    }

    @Test
    public void minTimeToVisitAllPoints_2() {
        int[][] points = {{3,2},{-2,2}};
        MinTimeToVisitAllPoints_1266 minTimeToVisitAllPoints_1266 = new MinTimeToVisitAllPoints_1266();
        assertEquals(5, minTimeToVisitAllPoints_1266.minTimeToVisitAllPoints(points));
    }

}