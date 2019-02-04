package practice.leecode.qq;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegexMatch_10Test {

    @Test
    public void isMatch() {

        RegexMatch_10 regexMatch_10 = new RegexMatch_10();

        /*assertEquals(false, regexMatch_10.isMatch("aa" , "a"));
        assertEquals(true, regexMatch_10.isMatch("aa" , "*"));
        assertEquals(true, regexMatch_10.isMatch("aa" , ".*"));

        assertEquals(true, regexMatch_10.isMatch("aab" , "c*a*b"));
        assertEquals(false, regexMatch_10.isMatch("mississippi" , "mis*is*p*."));
        assertEquals(true, regexMatch_10.isMatch("mississippi" , "mis*is*ip*."));*/

        assertEquals(true, regexMatch_10.isMatch("aaba" , "ab*a*c*a"));

    }
}