package practice.leecode.Bits;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingleNumber_260Test {

    SingleNumber_260 singleNumber_260 = new SingleNumber_260();

    @Test
    public void singleNumber() {
        int[] res = singleNumber_260.singleNumber(new int[]{1,2,1,3,2,5});
        assertTrue(res[0] == 3 || res[0] == 5);
        assertTrue(res[1] == 3 || res[1] == 5);
    }
}