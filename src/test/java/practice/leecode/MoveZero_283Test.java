package practice.leecode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZero_283Test {

    @Test
    public void moveZeroes() {
        MoveZero_283 moveZero = new MoveZero_283();
        int[] nums = new int[]{0,1,0,3,12};
        moveZero.moveZeroes(nums);
        assertArrayEquals(new int[]{1,3,12,0,0}, nums);
    }
}