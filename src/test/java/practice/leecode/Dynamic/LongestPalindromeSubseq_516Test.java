package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeSubseq_516Test {

    @Test
    public void longestPalindromeSubseq_1() {
        LongestPalindromeSubseq_516 longestPalindromeSubseq_516 = new LongestPalindromeSubseq_516();
        assertEquals(4, longestPalindromeSubseq_516.longestPalindromeSubseq("bbbab"));
    }

    @Test
    public void longestPalindromeSubseq_2() {
        LongestPalindromeSubseq_516 longestPalindromeSubseq_516 = new LongestPalindromeSubseq_516();
        assertEquals(2, longestPalindromeSubseq_516.longestPalindromeSubseq("cbbd"));
    }

}