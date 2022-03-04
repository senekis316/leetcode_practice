package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubArrayRanges_2104Test {

    @Test
    public void subArrayRanges_1() {
        SubArrayRanges_2104 subArrayRanges_2104 = new SubArrayRanges_2104();
        assertEquals(4, subArrayRanges_2104.subArrayRanges(new int[]{1,2,3}));
    }

    @Test
    public void subArrayRanges_2() {
        SubArrayRanges_2104 subArrayRanges_2104 = new SubArrayRanges_2104();
        assertEquals(4, subArrayRanges_2104.subArrayRanges(new int[]{1,3,3}));
    }

    @Test
    public void subArrayRanges_3() {
        SubArrayRanges_2104 subArrayRanges_2104 = new SubArrayRanges_2104();
        assertEquals(59, subArrayRanges_2104.subArrayRanges(new int[]{4,-2,-3,4,1}));
    }

}