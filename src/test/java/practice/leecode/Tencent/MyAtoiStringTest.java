package practice.leecode.Tencent;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyAtoiStringTest {

    @Test
    public void myAtoi() {

        MyAtoiString myAtoiString = new MyAtoiString();
        assertEquals(42, myAtoiString.myAtoi("42"));
        assertEquals(-42, myAtoiString.myAtoi("   -42"));
        assertEquals(4193, myAtoiString.myAtoi("4193 with words"));
        assertEquals(0, myAtoiString.myAtoi("words and 987"));
        assertEquals(0, myAtoiString.myAtoi(".1"));
        assertEquals(0, myAtoiString.myAtoi("-+2"));

    }
}