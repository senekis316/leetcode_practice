package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrangePrinter_664Test {

    @Test
    public void strangePrinter_1() {
        StrangePrinter_664 strangePrinter_664 = new StrangePrinter_664();
        assertEquals(2, strangePrinter_664.strangePrinter("aaabbb"));
    }

    @Test
    public void strangePrinter_2() {
        StrangePrinter_664 strangePrinter_664 = new StrangePrinter_664();
        assertEquals(2, strangePrinter_664.strangePrinter("aba"));
    }

}