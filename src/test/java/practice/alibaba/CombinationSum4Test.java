package practice.alibaba;

import org.junit.Test;

import static org.junit.Assert.*;

public class CombinationSum4Test {

    @Test
    public void combinationSum4_1() {
        assertEquals(7, new CombinationSum4().combinationSum4(new int[]{1, 2, 3}, 4));
    }


    @Test
    public void combinationSum4_2() {
        assertEquals(35, new CombinationSum4().combinationSum4(new int[]{2, 1, 3}, 35));
    }

}