package practice.leecode.HashMap;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumSmallerByFrequency_1170Test {

    @Test
    public void numSmallerByFrequency_1() {
        String[] queries = new String[]{"cbd"};
        String[] words = new String[]{"zaaaz"};
        NumSmallerByFrequency_1170 NumSmallerByFrequency_1170 = new NumSmallerByFrequency_1170();
        assertArrayEquals(new int[]{1}, NumSmallerByFrequency_1170.numSmallerByFrequency(queries, words));
    }

    @Test
    public void numSmallerByFrequency_2() {
        String[] queries = new String[]{"bbb","cc"};
        String[] words = new String[]{"a","aa","aaa","aaaa"};
        NumSmallerByFrequency_1170 NumSmallerByFrequency_1170 = new NumSmallerByFrequency_1170();
        assertArrayEquals(new int[]{1,2}, NumSmallerByFrequency_1170.numSmallerByFrequency(queries, words));
    }

    @Test
    public void numSmallerByFrequency_3() {
        String[] queries = new String[]{"aabbabbb","abbbabaa","aabbbabaa","aabba","abb","a","ba","aa","ba","baabbbaaaa","babaa","bbbbabaa"};
        String[] words = new String[]{"b","aaaba","aaaabba","aa","aabaabab","aabbaaabbb","ababb","bbb","aabbbabb","aab","bbaaababba","baaaaa"};
        NumSmallerByFrequency_1170 NumSmallerByFrequency_1170 = new NumSmallerByFrequency_1170();
        assertArrayEquals(new int[]{6,5,0,6,11,11,11,8,11,0,6,6}, NumSmallerByFrequency_1170.numSmallerByFrequency(queries, words));
    }

    /**
     *  ["aabbabbb","abbbabaa","aabbbabaa","aabba","abb","a","ba","aa","ba","baabbbaaaa","babaa","bbbbabaa"]
     * ["b","aaaba","aaaabba","aa","aabaabab","aabbaaabbb","ababb","bbb","aabbbabb","aab","bbaaababba","baaaaa"]
     */

}