package practice.leecode.Tencent.MathAndNumber;

import org.junit.Test;

import static org.junit.Assert.*;


public class NumberReverseTest {

    @Test
    public void reverse() {

        NumberReverse numberReverse = new NumberReverse();
        assertEquals(123, numberReverse.reverse(321));
        assertEquals(-123, numberReverse.reverse(-321));
        assertEquals(21, numberReverse.reverse(120));
        assertEquals(0, numberReverse.reverse(0));
        assertEquals(0, numberReverse.reverse(1534236469));

    }
}