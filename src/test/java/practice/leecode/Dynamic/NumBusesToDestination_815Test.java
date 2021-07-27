package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumBusesToDestination_815Test {

    @Test
    public void numBusesToDestination_1() {
        int[][] routes = new int[][]{{1,2,7},{3,6,7}};
        int source = 1;
        int target = 6;
        NumBusesToDestination_815 numBusesToDestination_815 = new NumBusesToDestination_815();
        assertEquals(2, numBusesToDestination_815.numBusesToDestination(routes, source, target));
    }

    @Test
    public void numBusesToDestination_2() {
        int[][] routes = new int[][]{{7,12},{4,5,15},{6},{15,19},{9,12,13}};
        int source = 15;
        int target = 12;
        NumBusesToDestination_815 numBusesToDestination_815 = new NumBusesToDestination_815();
        assertEquals(-1, numBusesToDestination_815.numBusesToDestination(routes, source, target));
    }

}