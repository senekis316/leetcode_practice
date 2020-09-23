package practice.leecode.Tencent;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubArray_53Test {

    @Test
    public void maxSubArray() {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray_53 maxSubArray_53 = new MaxSubArray_53();
        assertEquals(6, maxSubArray_53.maxSubArray(nums));
    }

}