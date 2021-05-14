package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntToRoman_12Test {

    @Test
    public void intToRoman_1() {
        IntToRoman_12 intToRoman_12 = new IntToRoman_12();
        assertEquals("III", intToRoman_12.intToRoman(3));
    }

    @Test
    public void intToRoman_2() {
        IntToRoman_12 intToRoman_12 = new IntToRoman_12();
        assertEquals("IV", intToRoman_12.intToRoman(4));
    }

    @Test
    public void intToRoman_3() {
        IntToRoman_12 intToRoman_12 = new IntToRoman_12();
        assertEquals("IX", intToRoman_12.intToRoman(9));
    }

    @Test
    public void intToRoman_4() {
        IntToRoman_12 intToRoman_12 = new IntToRoman_12();
        assertEquals("LVIII", intToRoman_12.intToRoman(58));
    }

    @Test
    public void intToRoman_5() {
        IntToRoman_12 intToRoman_12 = new IntToRoman_12();
        assertEquals("MCMXCIV", intToRoman_12.intToRoman(1994));
    }

}