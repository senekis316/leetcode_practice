package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseVowels_345Test {

    @Test
    public void reverseVowels_1() {
        ReverseVowels_345 reverseVowels_345 = new ReverseVowels_345();
        assertEquals("holle", reverseVowels_345.reverseVowels("hello"));
    }

    @Test
    public void reverseVowels_2() {
        ReverseVowels_345 reverseVowels_345 = new ReverseVowels_345();
        assertEquals("leotcede", reverseVowels_345.reverseVowels("leetcode"));
    }

}