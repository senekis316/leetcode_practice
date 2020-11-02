package practice.leecode.Arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Solution_384Test {

    @Test
    public void shuffle_1() {
        int[] nums = {1,2,3};
        Solution_384 solution = new Solution_384(nums);
        assertTrue(solution.shuffle().length == nums.length);
    }

    @Test
    public void shuffle_2() {
        int[] nums = {1,2};
        Solution_384 solution = new Solution_384(nums);
        System.out.println(Arrays.toString(solution.shuffle()));
        System.out.println(Arrays.toString(solution.shuffle()));
        System.out.println(Arrays.toString(solution.shuffle()));
        System.out.println(Arrays.toString(solution.shuffle()));
    }

    @Test
    public void reset() {
        int[] nums = {1,2,3};
        Solution_384 solution = new Solution_384(nums);
        assertArrayEquals(nums, solution.reset());
    }

}