package practice.leecode.Math;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistributeCandies_1103Test {

    @Test
    public void distributeCandies_1() {
        DistributeCandies_1103 distributeCandies_1103 = new DistributeCandies_1103();
        assertArrayEquals(new int[]{1,2,3,1}, distributeCandies_1103.distributeCandies(7, 4));
    }

    @Test
    public void distributeCandies_2() {
        DistributeCandies_1103 distributeCandies_1103 = new DistributeCandies_1103();
        assertArrayEquals(new int[]{5,2,3}, distributeCandies_1103.distributeCandies(10, 3));
    }

}