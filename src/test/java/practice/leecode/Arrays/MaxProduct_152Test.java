package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxProduct_152Test {

    @Test
    public void maxProduct_1() {
        MaxProduct_152 maxProduct_152 = new MaxProduct_152();
        assertEquals(6, maxProduct_152.maxProduct(new int[]{2,3,-2,4}));
    }

    @Test
    public void maxProduct_2() {
        MaxProduct_152 maxProduct_152 = new MaxProduct_152();
        assertEquals(0, maxProduct_152.maxProduct(new int[]{-2,0,-1}));
    }

}