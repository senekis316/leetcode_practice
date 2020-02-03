package practice.alibaba;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntTest {

    @Test
    public void romanToInt() {
        RomanToInt_13 romanToInt = new RomanToInt_13();
        assertEquals(3, romanToInt.romanToInt("III"));
        assertEquals(4, romanToInt.romanToInt("IV"));
        assertEquals(9, romanToInt.romanToInt("IX"));
        assertEquals(58, romanToInt.romanToInt("LVIII"));
        assertEquals(1994, romanToInt.romanToInt("MCMXCIV"));
    }


}