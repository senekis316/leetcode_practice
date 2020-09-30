package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfit_121Test {

    @Test
    public void maxProfit_1() {
        int[] prices = new int[]{7,1,5,3,6,4};
        MaxProfit_121 maxProfit_121 = new MaxProfit_121();
        assertEquals(5, maxProfit_121.maxProfit(prices));
    }

    @Test
    public void maxProfit_2() {
        int[] prices = new int[]{7,6,4,3,1};
        MaxProfit_121 maxProfit_121 = new MaxProfit_121();
        assertEquals(0, maxProfit_121.maxProfit(prices));
    }

    @Test
    public void maxProfit_3() {
        int[] prices = new int[]{};
        MaxProfit_121 maxProfit_121 = new MaxProfit_121();
        assertEquals(0, maxProfit_121.maxProfit(prices));
    }

}