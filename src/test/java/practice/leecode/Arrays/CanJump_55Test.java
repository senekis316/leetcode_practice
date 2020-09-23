package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanJump_55Test {

    @Test
    public void canJump_1() {
        int[] nums = new int[]{2,3,1,1,4};
        CanJump_55 canJump_55 = new CanJump_55();
        assertTrue(canJump_55.canJump(nums));
    }

    @Test
    public void canJump_2() {
        int[] nums = new int[]{3,2,1,0,4};
        CanJump_55 canJump_55 = new CanJump_55();
        assertFalse(canJump_55.canJump(nums));
    }

    @Test
    public void canJump_3() {
        int[] nums = new int[]{1,2,3};
        CanJump_55 canJump_55 = new CanJump_55();
        assertTrue(canJump_55.canJump(nums));
    }

    @Test
    public void canJump_4() {
        int[] nums = new int[]{1,3,2};
        CanJump_55 canJump_55 = new CanJump_55();
        assertTrue(canJump_55.canJump(nums));
    }

    @Test
    public void canJump_5() {
        int[] nums = new int[]{5,9,3,2,1,0,2,3,3,1,0,0};
        CanJump_55 canJump_55 = new CanJump_55();
        assertTrue(canJump_55.canJump(nums));
    }

}