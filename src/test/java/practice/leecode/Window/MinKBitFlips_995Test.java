package practice.leecode.Window;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinKBitFlips_995Test {

    @Test
    public void minKBitFlips_1() {
        MinKBitFlips_995 minKBitFlips_995 = new MinKBitFlips_995();
        assertEquals(2, minKBitFlips_995.minKBitFlips(new int[]{0,1,0}, 1));
    }

    @Test
    public void minKBitFlips_2() {
        MinKBitFlips_995 minKBitFlips_995 = new MinKBitFlips_995();
        assertEquals(-1, minKBitFlips_995.minKBitFlips(new int[]{1,1,0}, 2));
    }

    @Test
    public void minKBitFlips_3() {
        MinKBitFlips_995 minKBitFlips_995 = new MinKBitFlips_995();
        assertEquals(3, minKBitFlips_995.minKBitFlips(new int[]{0,0,0,1,0,1,1,0}, 3));
    }

}