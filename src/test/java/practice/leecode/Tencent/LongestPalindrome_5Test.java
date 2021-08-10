package practice.leecode.Tencent;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindrome_5Test {

    @Test
    public void findLongestPalindromeString() {
        LongestPalindrome_5 longestPalindrome = new LongestPalindrome_5();
        assertEquals("abba", longestPalindrome.longestPalindrome("abba"));
        assertEquals("bab", longestPalindrome.longestPalindrome("babad"));
    }
}