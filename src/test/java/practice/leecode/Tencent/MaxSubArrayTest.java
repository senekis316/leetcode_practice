package practice.leecode.Tencent;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubArrayTest {

    @Test
    public void maxSubArray() {

        MaxSubArray_53 maxSubArray = new MaxSubArray_53();
        assertEquals(6, maxSubArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

    }
}