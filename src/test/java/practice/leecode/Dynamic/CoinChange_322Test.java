package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChange_322Test {

    @Test
    public void coinChang_1() {
        CoinChange_322 coinChange_322 = new CoinChange_322();
        assertEquals(3, coinChange_322.coinChange(new int[]{1,2,5}, 11));
    }

    @Test
    public void coinChang_2() {
        CoinChange_322 coinChange_322 = new CoinChange_322();
        assertEquals(-1, coinChange_322.coinChange(new int[]{2}, 3));
    }

    @Test
    public void coinChang_3() {
        CoinChange_322 coinChange_322 = new CoinChange_322();
        assertEquals(0, coinChange_322.coinChange(new int[]{1}, 0));
    }

    @Test
    public void coinChang_4() {
        CoinChange_322 coinChange_322 = new CoinChange_322();
        assertEquals(1, coinChange_322.coinChange(new int[]{1}, 1));
    }

    @Test
    public void coinChang_5() {
        CoinChange_322 coinChange_322 = new CoinChange_322();
        assertEquals(2, coinChange_322.coinChange(new int[]{1}, 2));
    }

}