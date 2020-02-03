package practice.leecode.Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestPerimeter_976Test {

    @Test
    public void largestPerimeter_1() {
        int[] input = {2,1,2};
        LargestPerimeter_976 LargestPerimeter_976 = new LargestPerimeter_976();
        assertEquals(5, LargestPerimeter_976.largestPerimeter(input));
    }

    @Test
    public void largestPerimeter_2() {
        int[] input = {1,2,1};
        LargestPerimeter_976 LargestPerimeter_976 = new LargestPerimeter_976();
        assertEquals(0, LargestPerimeter_976.largestPerimeter(input));
    }

    @Test
    public void largestPerimeter_3() {
        int[] input = {3,2,3,4};
        LargestPerimeter_976 LargestPerimeter_976 = new LargestPerimeter_976();
        assertEquals(10, LargestPerimeter_976.largestPerimeter(input));
    }

    @Test
    public void largestPerimeter_4() {
        int[] input = {3,6,2,3};
        LargestPerimeter_976 LargestPerimeter_976 = new LargestPerimeter_976();
        assertEquals(8, LargestPerimeter_976.largestPerimeter(input));
    }
}