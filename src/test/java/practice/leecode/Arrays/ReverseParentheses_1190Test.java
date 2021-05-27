package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseParentheses_1190Test {

    @Test
    public void reverseParentheses_1() {
        ReverseParentheses_1190 reverseParentheses_1190 = new ReverseParentheses_1190();
        assertEquals("dcba", reverseParentheses_1190.reverseParentheses("(abcd)"));
    }

    @Test
    public void reverseParentheses_2() {
        ReverseParentheses_1190 reverseParentheses_1190 = new ReverseParentheses_1190();
        assertEquals("iloveu", reverseParentheses_1190.reverseParentheses("(u(love)i)"));
    }

    @Test
    public void reverseParentheses_3() {
        ReverseParentheses_1190 reverseParentheses_1190 = new ReverseParentheses_1190();
        assertEquals("leetcode", reverseParentheses_1190.reverseParentheses("(ed(et(oc))el)"));
    }

    @Test
    public void reverseParentheses_4() {
        ReverseParentheses_1190 reverseParentheses_1190 = new ReverseParentheses_1190();
        assertEquals("apmnolkjihgfedcbq", reverseParentheses_1190.reverseParentheses("a(bcdefghijkl(mno)p)q"));
    }

}