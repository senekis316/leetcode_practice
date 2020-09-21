package practice.leecode.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsValid_20Test {

    @Test
    public void isValid_1() {
        IsValid_20 isValid_20 = new IsValid_20();
        assertTrue(isValid_20.isValid("()"));
    }

    @Test
    public void isValid_2() {
        IsValid_20 isValid_20 = new IsValid_20();
        assertTrue(isValid_20.isValid("()[]{}"));
    }

    @Test
    public void isValid_3() {
        IsValid_20 isValid_20 = new IsValid_20();
        assertFalse(isValid_20.isValid("(]"));
    }

    @Test
    public void isValid_4() {
        IsValid_20 isValid_20 = new IsValid_20();
        assertFalse(isValid_20.isValid("([)]"));
    }

    @Test
    public void isValid_5() {
        IsValid_20 isValid_20 = new IsValid_20();
        assertTrue(isValid_20.isValid("{[]}"));
    }

    @Test
    public void isValid_6() {
        IsValid_20 isValid_20 = new IsValid_20();
        assertFalse(isValid_20.isValid("{{"));
    }

}