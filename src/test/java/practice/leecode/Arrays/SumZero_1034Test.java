package practice.leecode.Arrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class SumZero_1034Test {

    @Test
    public void sumZero() {
        SumZero_1034 sumZero_1034 = new SumZero_1034();
        int[] nums = sumZero_1034.sumZero(5);
        assertEquals(5, nums.length);
        assertEquals(0, Arrays.stream(nums).sum());
    }

}