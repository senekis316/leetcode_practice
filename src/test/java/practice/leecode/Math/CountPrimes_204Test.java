package practice.leecode.Math;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountPrimes_204Test {

    @Test
    public void countPrimes_1() {
        CountPrimes_204 countPrimes_204 = new CountPrimes_204();
        assertEquals(4, countPrimes_204.countPrimes(10));
    }

    @Test
    public void countPrimes_2() {
        CountPrimes_204 countPrimes_204 = new CountPrimes_204();
        assertEquals(0, countPrimes_204.countPrimes(0));
    }

    @Test
    public void countPrimes_3() {
        CountPrimes_204 countPrimes_204 = new CountPrimes_204();
        assertEquals(0, countPrimes_204.countPrimes(1));
    }

    @Test
    public void countPrimes_4() {
        CountPrimes_204 countPrimes_204 = new CountPrimes_204();
        assertEquals(41537, countPrimes_204.countPrimes(499979));
    }

}