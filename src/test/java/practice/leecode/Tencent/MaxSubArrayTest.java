package practice.leecode.Tencent;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubArrayTest {

    @Test
    public void maxSubArray() {

        MaxSubArray maxSubArray = new MaxSubArray();
        assertEquals(6, maxSubArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

    }
}