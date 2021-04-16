package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Rob_213Test {

    @Test
    public void rob_1() {
        Rob_213 rob_213 = new Rob_213();
        assertEquals(3, rob_213.rob(new int[]{2,3,2}));
    }

    @Test
    public void rob_2() {
        Rob_213 rob_213 = new Rob_213();
        assertEquals(4, rob_213.rob(new int[]{1,2,3,1}));
    }

    @Test
    public void rob_3() {
        Rob_213 rob_213 = new Rob_213();
        assertEquals(0, rob_213.rob(new int[]{0}));
    }

}