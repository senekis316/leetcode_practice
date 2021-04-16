package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsScramble_87Test {

    @Test
    public void isScramble_1() {
        IsScramble_87 isScramble_87 = new IsScramble_87();
        assertEquals(true, isScramble_87.isScramble("great", "rgeat"));
    }

    @Test
    public void isScramble_2() {
        IsScramble_87 isScramble_87 = new IsScramble_87();
        assertEquals(false, isScramble_87.isScramble("abcde", "caebd"));
    }

    @Test
    public void isScramble_3() {
        IsScramble_87 isScramble_87 = new IsScramble_87();
        assertEquals(true, isScramble_87.isScramble("a", "a"));
    }

    @Test
    public void isScramble_4() {
        IsScramble_87 isScramble_87 = new IsScramble_87();
        assertEquals(true, isScramble_87.isScramble("abcdbdacbdac", "bdacabcdbdac"));
    }

    @Test
    public void isScramble_5() {
        IsScramble_87 isScramble_87 = new IsScramble_87();
        assertEquals(false, isScramble_87.isScramble("abcdefghij", "efghijcadb"));
    }

    @Test
    public void isScramble_6() {
        IsScramble_87 isScramble_87 = new IsScramble_87();
        assertEquals(true, isScramble_87.isScramble("abab", "bbaa"));
    }

    @Test
    public void isScramble_7() {
        IsScramble_87 isScramble_87 = new IsScramble_87();
        assertEquals(false, isScramble_87.isScramble("great", "tegar"));
    }

    @Test
    public void isScramble_8() {
        IsScramble_87 isScramble_87 = new IsScramble_87();
        assertEquals(false, isScramble_87.isScramble("cbcbabc", "bbbccca"));
    }

}