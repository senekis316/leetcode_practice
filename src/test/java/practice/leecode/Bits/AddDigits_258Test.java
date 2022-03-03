package practice.leecode.Bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddDigits_258Test {

    @Test
    public void addDigits_1() {
        AddDigits_258 addDigits_258 = new AddDigits_258();
        assertEquals(2, addDigits_258.addDigits(38));
    }

    @Test
    public void addDigits_2() {
        AddDigits_258 addDigits_258 = new AddDigits_258();
        assertEquals(0, addDigits_258.addDigits(0));
    }

}