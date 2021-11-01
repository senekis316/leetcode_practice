package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistributeCandies_575Test {

    @Test
    public void distributeCandies_1() {
        DistributeCandies_575 distributeCandies_575 = new DistributeCandies_575();
        assertEquals(3, distributeCandies_575.distributeCandies(new int[]{1,1,2,2,3,3}));
    }

    @Test
    public void distributeCandies_2() {
        DistributeCandies_575 distributeCandies_575 = new DistributeCandies_575();
        assertEquals(2, distributeCandies_575.distributeCandies(new int[]{1,1,2,3}));
    }

    @Test
    public void distributeCandies_3() {
        DistributeCandies_575 distributeCandies_575 = new DistributeCandies_575();
        assertEquals(2, distributeCandies_575.distributeCandies(new int[]{100000,0,100000,0,100000,0,100000,0,100000,0,100000,0}));
    }

    @Test
    public void distributeCandies_4() {
        DistributeCandies_575 distributeCandies_575 = new DistributeCandies_575();
        assertEquals(1, distributeCandies_575.distributeCandies(new int[]{6,6,6,6}));
    }

}