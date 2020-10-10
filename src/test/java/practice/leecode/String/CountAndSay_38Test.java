package practice.leecode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountAndSay_38Test {

    @Test
    public void countAndSay_1() {
        CountAndSay_38 countAndSay_38 = new CountAndSay_38();
        assertEquals("1", countAndSay_38.countAndSay(1));
    }

    @Test
    public void countAndSay_2() {
        CountAndSay_38 countAndSay_38 = new CountAndSay_38();
        assertEquals("1211", countAndSay_38.countAndSay(4));
    }

    @Test
    public void countAndSay_3() {
        CountAndSay_38 countAndSay_38 = new CountAndSay_38();
        assertEquals("111221", countAndSay_38.countAndSay(5));
    }

}