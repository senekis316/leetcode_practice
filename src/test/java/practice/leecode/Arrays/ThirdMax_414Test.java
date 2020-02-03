package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThirdMax_414Test {

    @Test
    public void thirdMax_1() {
        ThirdMax_414 thirdMax_414 = new ThirdMax_414();
        assertEquals(1, thirdMax_414.thirdMax(new int[]{3, 2, 1}));
    }

    @Test
    public void thirdMax_2() {
        ThirdMax_414 thirdMax_414 = new ThirdMax_414();
        assertEquals(2, thirdMax_414.thirdMax(new int[]{1, 2}));
    }

    @Test
    public void thirdMax_3() {
        ThirdMax_414 thirdMax_414 = new ThirdMax_414();
        assertEquals(1, thirdMax_414.thirdMax(new int[]{2, 2, 3, 1}));
    }

}