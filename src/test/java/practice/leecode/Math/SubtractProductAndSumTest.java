package practice.leecode.Math;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractProductAndSumTest {

    @Test
    public void subtractProductAndSum_1() {
        SubtractProductAndSum_1281 subtractProductAndSum = new SubtractProductAndSum_1281();
        assertEquals(15, subtractProductAndSum.subtractProductAndSum(234));
    }

    @Test
    public void subtractProductAndSum_2() {
        SubtractProductAndSum_1281 subtractProductAndSum = new SubtractProductAndSum_1281();
        assertEquals(21, subtractProductAndSum.subtractProductAndSum(4421));
    }

}