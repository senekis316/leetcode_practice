package practice.leecode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrStr_28Test {

    @Test
    public void strStr_1() {
        StrStr_28 strStr_28 = new StrStr_28();
        assertEquals(2, strStr_28.strStr("hello", "ll"));
    }

    @Test
    public void strStr_2() {
        StrStr_28 strStr_28 = new StrStr_28();
        assertEquals(-1, strStr_28.strStr("aaaaa", "bba"));
    }

    @Test
    public void strStr_3() {
        StrStr_28 strStr_28 = new StrStr_28();
        assertEquals(4, strStr_28.strStr("helollo", "ll"));
    }

    @Test
    public void strStr_4() {
        StrStr_28 strStr_28 = new StrStr_28();
        assertEquals(0, strStr_28.strStr("", ""));
    }

}