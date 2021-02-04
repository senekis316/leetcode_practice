package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianSlidingWindow_480Test {

    @Test
    public void medianSlidingWindow_1() {
        MedianSlidingWindow_480 medianSlidingWindow_480 = new MedianSlidingWindow_480();
        double[] result = medianSlidingWindow_480.medianSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
        double[] expect = new double[]{1,-1,-1,3,5,6};
        assertArrayEquals(expect, result, 0.0);
    }

    @Test
    public void medianSlidingWindow_2() {
        MedianSlidingWindow_480 medianSlidingWindow_480 = new MedianSlidingWindow_480();
        double[] result = medianSlidingWindow_480.medianSlidingWindow(new int[]{1}, 1);
        double[] expect = new double[]{1};
        assertArrayEquals(expect, result, 0.0);
    }

    @Test
    public void medianSlidingWindow_3() {
        MedianSlidingWindow_480 medianSlidingWindow_480 = new MedianSlidingWindow_480();
        double[] result = medianSlidingWindow_480.medianSlidingWindow(new int[]{2147483647,2147483647}, 2);
        double[] expect = new double[]{2147483647.0};
        assertArrayEquals(expect, result, 0.0);
    }

}