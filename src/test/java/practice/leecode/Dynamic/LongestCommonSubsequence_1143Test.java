package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequence_1143Test {

    @Test
    public void longestCommonSubsequence_1() {
        LongestCommonSubsequence_1143 longestCommonSubsequence_1143 = new LongestCommonSubsequence_1143();
        assertEquals(3, longestCommonSubsequence_1143.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    public void longestCommonSubsequence_2() {
        LongestCommonSubsequence_1143 longestCommonSubsequence_1143 = new LongestCommonSubsequence_1143();
        assertEquals(3, longestCommonSubsequence_1143.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    public void longestCommonSubsequence_3() {
        LongestCommonSubsequence_1143 longestCommonSubsequence_1143 = new LongestCommonSubsequence_1143();
        assertEquals(0, longestCommonSubsequence_1143.longestCommonSubsequence("abc", "def"));
    }

    @Test
    public void longestCommonSubsequence_4() {
        LongestCommonSubsequence_1143 longestCommonSubsequence_1143 = new LongestCommonSubsequence_1143();
        assertEquals(1, longestCommonSubsequence_1143.longestCommonSubsequence("bsbininm", "jmjkbkjkv"));
    }

    @Test
    public void longestCommonSubsequence_5() {
        LongestCommonSubsequence_1143 longestCommonSubsequence_1143 = new LongestCommonSubsequence_1143();
        assertEquals(5, longestCommonSubsequence_1143.longestCommonSubsequence("abcba", "abcbcba"));
    }

}