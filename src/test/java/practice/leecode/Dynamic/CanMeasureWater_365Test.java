package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanMeasureWater_365Test {

    @Test
    public void canMeasureWater_1() {
        CanMeasureWater_365 canMeasureWater_365 = new CanMeasureWater_365();
        assertTrue(canMeasureWater_365.canMeasureWater(3,5,4));
    }

    @Test
    public void canMeasureWater_2() {
        CanMeasureWater_365 canMeasureWater_365 = new CanMeasureWater_365();
        assertFalse(canMeasureWater_365.canMeasureWater(2,6,5));
    }

}