package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubsequence_1218Test {

    @Test
    public void longestSubsequence_1() {
        int[] arr = new int[]{1,2,3,4};
        int difference = 1;
        LongestSubsequence_1218 longestSubsequence_1218 = new LongestSubsequence_1218();
        assertEquals(4, longestSubsequence_1218.longestSubsequence(arr, difference));
    }

    @Test
    public void longestSubsequence_2() {
        int[] arr = new int[]{1,3,5,7};
        int difference = 1;
        LongestSubsequence_1218 longestSubsequence_1218 = new LongestSubsequence_1218();
        assertEquals(1, longestSubsequence_1218.longestSubsequence(arr, difference));
    }

    @Test
    public void longestSubsequence_3() {
        int[] arr = new int[]{1,5,7,8,5,3,4,2,1};
        int difference = -2;
        LongestSubsequence_1218 longestSubsequence_1218 = new LongestSubsequence_1218();
        assertEquals(4, longestSubsequence_1218.longestSubsequence(arr, difference));
    }

}