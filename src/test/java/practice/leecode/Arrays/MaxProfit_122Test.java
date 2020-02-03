package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfit_122Test {

    @Test
    public void maxProfit1() {
        MaxProfit_122 maxProfit_122 = new MaxProfit_122();
        assertEquals(7, maxProfit_122.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void maxProfit2() {
        MaxProfit_122 maxProfit_122 = new MaxProfit_122();
        assertEquals(4, maxProfit_122.maxProfit(new int[]{1,2,3,4,5}));
    }

}