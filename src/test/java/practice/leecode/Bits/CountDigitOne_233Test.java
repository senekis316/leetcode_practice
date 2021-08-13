package practice.leecode.Bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountDigitOne_233Test {

    @Test
    public void countDigitOne_1() {
        CountDigitOne_233 countDigitOne_233 = new CountDigitOne_233();
        assertEquals(6, countDigitOne_233.countDigitOne(13));
    }

    @Test
    public void countDigitOne_2() {
        CountDigitOne_233 countDigitOne_233 = new CountDigitOne_233();
        assertEquals(0, countDigitOne_233.countDigitOne(0));
    }

}