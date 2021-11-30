package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNthDigit_400Test {

    @Test
    public void findNthDigit_1() {
        FindNthDigit_400 findNthDigit_400 = new FindNthDigit_400();
        assertEquals(3, findNthDigit_400.findNthDigit(3));
    }

    @Test
    public void findNthDigit_2() {
        FindNthDigit_400 findNthDigit_400 = new FindNthDigit_400();
        assertEquals(0, findNthDigit_400.findNthDigit(11));
    }

    @Test
    public void findNthDigit_3() {
        FindNthDigit_400 findNthDigit_400 = new FindNthDigit_400();
        assertEquals(2, findNthDigit_400.findNthDigit(2147483647));
    }

}