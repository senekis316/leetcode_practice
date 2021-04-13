package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestNumber_179Test {

    @Test
    public void largestNumber_1() {
        LargestNumber_179 largestNumber_179 = new LargestNumber_179();
        assertEquals("210", largestNumber_179.largestNumber(new int[]{10,2}));
    }

    @Test
    public void largestNumber_2() {
        LargestNumber_179 largestNumber_179 = new LargestNumber_179();
        assertEquals("9534330", largestNumber_179.largestNumber(new int[]{3,30,34,5,9}));
    }

    @Test
    public void largestNumber_3() {
        LargestNumber_179 largestNumber_179 = new LargestNumber_179();
        assertEquals("9534330", largestNumber_179.largestNumber(new int[]{3,30,34,5,9}));
    }

    @Test
    public void largestNumber_4() {
        LargestNumber_179 largestNumber_179 = new LargestNumber_179();
        assertEquals("1", largestNumber_179.largestNumber(new int[]{1}));
    }

    @Test
    public void largestNumber_5() {
        LargestNumber_179 largestNumber_179 = new LargestNumber_179();
        assertEquals("10", largestNumber_179.largestNumber(new int[]{10}));
    }

    @Test
    public void largestNumber_6() {
        LargestNumber_179 largestNumber_179 = new LargestNumber_179();
        assertEquals("0", largestNumber_179.largestNumber(new int[]{0,0}));
    }

    @Test
    public void largestNumber_7() {
        LargestNumber_179 largestNumber_179 = new LargestNumber_179();
        assertEquals("9876543210", largestNumber_179.largestNumber(new int[]{0,9,8,7,6,5,4,3,2,1}));
    }

}