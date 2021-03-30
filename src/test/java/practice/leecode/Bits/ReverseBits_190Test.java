package practice.leecode.Bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseBits_190Test {

    @Test
    public void reverseBits() {
        ReverseBits_190 reverseBits_190 = new ReverseBits_190();
        assertEquals(0b00111001011110000010100101000000, reverseBits_190.reverseBits(0b00000010100101000001111010011100));
        assertEquals(0b10111111111111111111111111111111, reverseBits_190.reverseBits(0b11111111111111111111111111111101));
    }

}