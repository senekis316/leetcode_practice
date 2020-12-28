package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfit_181Test {

    @Test
    public void maxProfit_1() {
        MaxProfit_181 maxProfit_181 = new MaxProfit_181();
        assertEquals(2, maxProfit_181.maxProfit(2, new int[]{2,4,1}));
    }

    @Test
    public void maxProfit_2() {
        MaxProfit_181 maxProfit_181 = new MaxProfit_181();
        assertEquals(7, maxProfit_181.maxProfit(2, new int[]{3,2,6,5,0,3}));
    }

    @Test
    public void maxProfit_3() {
        MaxProfit_181 maxProfit_181 = new MaxProfit_181();
        assertEquals(13, maxProfit_181.maxProfit(2, new int[]{1,2,4,2,5,7,2,4,9,0}));
    }

}