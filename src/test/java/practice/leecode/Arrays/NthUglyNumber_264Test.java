package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthUglyNumber_264Test {

    @Test
    public void nthUglyNumber_1() {
        NthUglyNumber_264 nthUglyNumber_264 = new NthUglyNumber_264();
        assertEquals(12, nthUglyNumber_264.nthUglyNumber(10));
    }

    @Test
    public void nthUglyNumber_2() {
        NthUglyNumber_264 nthUglyNumber_264 = new NthUglyNumber_264();
        assertEquals(1, nthUglyNumber_264.nthUglyNumber(1));
    }

    @Test
    public void nthUglyNumber_3() {
        NthUglyNumber_264 nthUglyNumber_264 = new NthUglyNumber_264();
        assertEquals(536870912, nthUglyNumber_264.nthUglyNumber(1407));
    }

}