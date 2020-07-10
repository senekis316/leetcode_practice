package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindShortestSubArray_697Test {

    @Test
    public void findShortestSubArray_1() {
        FindShortestSubArray_697 FindShortestSubArray_697 = new FindShortestSubArray_697();
        assertEquals(2, FindShortestSubArray_697.findShortestSubArray(new int[]{1,2,2,3,1}));
    }

    @Test
    public void findShortestSubArray_2() {
        FindShortestSubArray_697 FindShortestSubArray_697 = new FindShortestSubArray_697();
        assertEquals(6, FindShortestSubArray_697.findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }

}