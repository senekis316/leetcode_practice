package practice.leecode.Bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountBits_338Test {

    @Test
    public void countBits_1() {
        CountBits_338 countBits_338 = new CountBits_338();
        assertArrayEquals(new int[]{0,1,1}, countBits_338.countBits(2));
    }

    @Test
    public void countBits_2() {
        CountBits_338 countBits_338 = new CountBits_338();
        assertArrayEquals(new int[]{0,1,1,2,1,2}, countBits_338.countBits(5));
    }

}