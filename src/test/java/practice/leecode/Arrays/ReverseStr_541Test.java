package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStr_541Test {

    @Test
    public void reverseStr_1() {
        ReverseStr_541 reverseStr_541 = new ReverseStr_541();
        assertEquals("bacdfeg", reverseStr_541.reverseStr("abcdefg", 2));
    }

    @Test
    public void reverseStr_2() {
        ReverseStr_541 reverseStr_541 = new ReverseStr_541();
        assertEquals("bacd", reverseStr_541.reverseStr("abcd", 2));
    }

}