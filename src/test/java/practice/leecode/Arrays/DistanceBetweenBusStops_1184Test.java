package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceBetweenBusStops_1184Test {

    @Test
    public void distanceBetweenBusStops_1() {
        int start = 0;
        int destination = 1;
        int[] distance = {1,2,3,4};
        DistanceBetweenBusStops_1184 DistanceBetweenBusStops_1184 = new DistanceBetweenBusStops_1184();
        assertEquals(1, DistanceBetweenBusStops_1184.distanceBetweenBusStops(distance, start, destination));
    }

    @Test
    public void distanceBetweenBusStops_2() {
        int start = 0;
        int destination = 2;
        int[] distance = {1,2,3,4};
        DistanceBetweenBusStops_1184 DistanceBetweenBusStops_1184 = new DistanceBetweenBusStops_1184();
        assertEquals(3, DistanceBetweenBusStops_1184.distanceBetweenBusStops(distance, start, destination));
    }

    @Test
    public void distanceBetweenBusStops_3() {
        int start = 0;
        int destination = 3;
        int[] distance = {1,2,3,4};
        DistanceBetweenBusStops_1184 DistanceBetweenBusStops_1184 = new DistanceBetweenBusStops_1184();
        assertEquals(4, DistanceBetweenBusStops_1184.distanceBetweenBusStops(distance, start, destination));
    }

    @Test
    public void distanceBetweenBusStops_4() {
        int start = 6;
        int destination = 2;
        int[] distance = {3,6,7,2,9,10,7,16,11};
        DistanceBetweenBusStops_1184 DistanceBetweenBusStops_1184 = new DistanceBetweenBusStops_1184();
        assertEquals(28, DistanceBetweenBusStops_1184.distanceBetweenBusStops(distance, start, destination));
    }

}