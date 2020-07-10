package practice.leecode.Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrangeWords_1451Test {

    @Test
    public void arrangeWords_1() {
        ArrangeWords_1451 arrangeWords_1451 = new ArrangeWords_1451();
        assertEquals("Is cool leetcode", arrangeWords_1451.arrangeWords("Leetcode is cool"));
    }

    @Test
    public void arrangeWords_2() {
        ArrangeWords_1451 arrangeWords_1451 = new ArrangeWords_1451();
        assertEquals("On and keep calm code", arrangeWords_1451.arrangeWords("Keep calm and code on"));
    }

}