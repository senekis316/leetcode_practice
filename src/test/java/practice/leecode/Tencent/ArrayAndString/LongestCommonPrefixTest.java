package practice.leecode.Tencent.ArrayAndString;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{}));
        assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"aa","a"}));
        assertEquals("c", longestCommonPrefix.longestCommonPrefix(new String[]{"c","c"}));


    }
}