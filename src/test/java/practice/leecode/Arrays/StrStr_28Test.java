package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrStr_28Test {

    @Test
    public void strStr_1() {
        assertEquals(2, new StrStr_28().strStr("hello", "ll"));
    }

    @Test
    public void strStr_2() {
        assertEquals(-1, new StrStr_28().strStr("aaaaa", "bba"));
    }

    @Test
    public void strStr_3() {
        assertEquals(0, new StrStr_28().strStr("", ""));
    }

    @Test
    public void getPrefixTable() {
        assertArrayEquals(new int[]{0,1,0,1,2,0}, new StrStr_28().getPrefixTable("aabaaf"));
    }

}