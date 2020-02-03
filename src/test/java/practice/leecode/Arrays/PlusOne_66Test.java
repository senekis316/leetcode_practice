package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOne_66Test {

    @Test
    public void plusOne_1() {
        PlusOne_66 plusOne_66 = new PlusOne_66();
        assertArrayEquals(new int[]{1,2,4}, plusOne_66.plusOne(new int[]{1,2,3}));
    }

    @Test
    public void plusOne_2() {
        PlusOne_66 plusOne_66 = new PlusOne_66();
        assertArrayEquals(new int[]{1,0}, plusOne_66.plusOne(new int[]{9}));
    }

    @Test
    public void plusOne_3() {
        PlusOne_66 plusOne_66 = new PlusOne_66();
        assertArrayEquals(new int[]{1,0,0}, plusOne_66.plusOne(new int[]{9,9}));
    }
}