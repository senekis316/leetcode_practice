package practice.leecode.GraphTheory;

import org.junit.Test;

import static org.junit.Assert.*;

public class NetworkDelayTime_743Test {

    @Test
    public void networkDelayTime_1() {
        int n = 4, k = 2;
        int[][] times = new int[][]{{2,1,1},{2,3,1},{3,4,1}};
        NetworkDelayTime_743 networkDelayTime_743 = new NetworkDelayTime_743();
        assertEquals(2, networkDelayTime_743.networkDelayTime(times, n, k));
    }

    @Test
    public void networkDelayTime_2() {
        int n = 2, k = 1;
        int[][] times = new int[][]{{1,2,1}};
        NetworkDelayTime_743 networkDelayTime_743 = new NetworkDelayTime_743();
        assertEquals(1, networkDelayTime_743.networkDelayTime(times, n, k));
    }

    @Test
    public void networkDelayTime_3() {
        int n = 2, k = 2;
        int[][] times = new int[][]{{1,2,1}};
        NetworkDelayTime_743 networkDelayTime_743 = new NetworkDelayTime_743();
        assertEquals(-1, networkDelayTime_743.networkDelayTime(times, n, k));
    }

}