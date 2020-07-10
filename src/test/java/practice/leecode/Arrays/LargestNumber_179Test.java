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

}