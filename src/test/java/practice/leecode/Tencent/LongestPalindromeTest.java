package practice.leecode.Tencent;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {

    @Test
    public void longestPalindrome() {

        LongestPalindrome longestPalindrome = new LongestPalindrome();

        assertEquals("bab", longestPalindrome.longestPalindrome("babad"));
        //assertEquals("bab", longestPalindrome.longestPalindrome("babad"));

    }
}