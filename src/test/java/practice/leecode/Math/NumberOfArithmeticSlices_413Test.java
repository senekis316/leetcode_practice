package practice.leecode.Math;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfArithmeticSlices_413Test {

    @Test
    public void numberOfArithmeticSlices_1() {
        NumberOfArithmeticSlices_413 numberOfArithmeticSlices_413 = new NumberOfArithmeticSlices_413();
        assertEquals(3, numberOfArithmeticSlices_413.numberOfArithmeticSlices(new int[]{1,2,3,4}));
    }

    @Test
    public void numberOfArithmeticSlices_2() {
        NumberOfArithmeticSlices_413 numberOfArithmeticSlices_413 = new NumberOfArithmeticSlices_413();
        assertEquals(0, numberOfArithmeticSlices_413.numberOfArithmeticSlices(new int[]{1}));
    }

}