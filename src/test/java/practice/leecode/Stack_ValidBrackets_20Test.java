package practice.leecode;

import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class Stack_ValidBrackets_20Test {

    @Test
    public void isValid() {
        Stack_ValidBrackets_20 stack_ValidBrackets_20 = new Stack_ValidBrackets_20();
        assertFalse(stack_ValidBrackets_20.isValid("){"));
    }

}