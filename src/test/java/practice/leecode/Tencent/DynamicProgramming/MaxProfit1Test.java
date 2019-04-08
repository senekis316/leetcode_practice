package practice.leecode.Tencent.DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfit1Test {

    @Test
    public void maxProfit() {

        MaxProfit1 maxProfit1 = new MaxProfit1();
        assertEquals(5, maxProfit1.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(0, maxProfit1.maxProfit(new int[]{7,6,4,3,1}));

    }
}