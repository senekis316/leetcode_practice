package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmallerNumbersThanCurrent_1365Test {

    @Test
    public void smallerNumbersThanCurrent_1() {
        int[] nums = new int[]{8,1,2,2,3};
        SmallerNumbersThanCurrent_1365 SmallerNumbersThanCurrent_1365 = new SmallerNumbersThanCurrent_1365();
        assertArrayEquals(new int[]{4,0,1,1,3}, SmallerNumbersThanCurrent_1365.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void smallerNumbersThanCurrent_2() {
        int[] nums = new int[]{6,5,4,8};
        SmallerNumbersThanCurrent_1365 SmallerNumbersThanCurrent_1365 = new SmallerNumbersThanCurrent_1365();
        assertArrayEquals(new int[]{2,1,0,3}, SmallerNumbersThanCurrent_1365.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void smallerNumbersThanCurrent_3() {
        int[] nums = new int[]{7,7,7,7};
        SmallerNumbersThanCurrent_1365 SmallerNumbersThanCurrent_1365 = new SmallerNumbersThanCurrent_1365();
        assertArrayEquals(new int[]{0,0,0,0}, SmallerNumbersThanCurrent_1365.smallerNumbersThanCurrent(nums));
    }
}