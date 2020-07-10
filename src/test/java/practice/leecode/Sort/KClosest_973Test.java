package practice.leecode.Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class KClosest_973Test {

    @Test
    public void kClosest_1() {
        int K = 1;
        int[][] points = {{1,3},{-2,2}};
        KClosest_973 kClosest_973 = new KClosest_973();
        assertArrayEquals(new int[][]{{-2, 2}}, kClosest_973.kClosest(points, K));
    }

    @Test
    public void kClosest_2() {
        int K = 2;
        int[][] points = {{3,3},{5,-1},{-2,4}};
        KClosest_973 kClosest_973 = new KClosest_973();
        assertArrayEquals(new int[][]{{3,3},{-2,4}}, kClosest_973.kClosest(points, K));
    }
}