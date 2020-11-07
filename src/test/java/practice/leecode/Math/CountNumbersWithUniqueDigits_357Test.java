package practice.leecode.Math;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountNumbersWithUniqueDigits_357Test {

    @Test
    public void countNumbersWithUniqueDigits_1() {
        CountNumbersWithUniqueDigits_357 countNumbersWithUniqueDigits_357 = new CountNumbersWithUniqueDigits_357();
        assertEquals(91, countNumbersWithUniqueDigits_357.countNumbersWithUniqueDigits(2));
    }

    @Test
    public void countNumbersWithUniqueDigits_2() {
        CountNumbersWithUniqueDigits_357 countNumbersWithUniqueDigits_357 = new CountNumbersWithUniqueDigits_357();
        assertEquals(1, countNumbersWithUniqueDigits_357.countNumbersWithUniqueDigits(0));
    }

    @Test
    public void countNumbersWithUniqueDigits_3() {
        CountNumbersWithUniqueDigits_357 countNumbersWithUniqueDigits_357 = new CountNumbersWithUniqueDigits_357();
        assertEquals(739, countNumbersWithUniqueDigits_357.countNumbersWithUniqueDigits(3));
    }

}