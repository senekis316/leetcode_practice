package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class XorOperation_1486Test {

    @Test
    public void xorOperation_1() {
        XorOperation_1486 xorOperation_1486 = new XorOperation_1486();
        assertEquals(8, xorOperation_1486.xorOperation(5, 0));
    }

    @Test
    public void xorOperation_2() {
        XorOperation_1486 xorOperation_1486 = new XorOperation_1486();
        assertEquals(8, xorOperation_1486.xorOperation(4, 3));
    }

    @Test
    public void xorOperation_3() {
        XorOperation_1486 xorOperation_1486 = new XorOperation_1486();
        assertEquals(7, xorOperation_1486.xorOperation(1, 7));
    }

    @Test
    public void xorOperation_4() {
        XorOperation_1486 xorOperation_1486 = new XorOperation_1486();
        assertEquals(2, xorOperation_1486.xorOperation(10, 5));
    }
}