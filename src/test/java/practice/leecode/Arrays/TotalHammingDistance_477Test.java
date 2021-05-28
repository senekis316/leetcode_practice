package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class TotalHammingDistance_477Test {

    @Test
    public void totalHammingDistance_1() {
        TotalHammingDistance_477 totalHammingDistance_477 = new TotalHammingDistance_477();
        assertEquals(6, totalHammingDistance_477.totalHammingDistance(new int[]{4,14,2}));
    }

    @Test
    public void totalHammingDistance_2() {
        TotalHammingDistance_477 totalHammingDistance_477 = new TotalHammingDistance_477();
        assertEquals(22, totalHammingDistance_477.totalHammingDistance(new int[]{6,1,8,6,8}));
    }

}