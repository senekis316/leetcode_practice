package practice.leecode.qq;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring() {
        LengthOfLongestSubstring LengthOfLongestSubstring = new LengthOfLongestSubstring();
        assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring(""), 0);
        assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring(" "), 1);
        assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("dvdf"), 3);
        assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("bbbbbb"), 1);
        assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("anviaj"), 5);
        assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"), 3);
        assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("abababab"), 2);
    }


}