package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSum_167Test {

    @Test
    public void twoSum1() {
        TwoSum_167 twoSum_167 = new TwoSum_167();
        assertArrayEquals(new int[]{1,2}, twoSum_167.twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void twoSum2() {
        TwoSum_167 twoSum_167 = new TwoSum_167();
        assertArrayEquals(new int[]{4,5}, twoSum_167.twoSum(new int[]{1,2,3,4,4,9,56,90}, 8));
    }
}