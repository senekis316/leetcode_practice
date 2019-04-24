package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class Stack_BaseCompute_224Test {

    @Test
    public void calculate() {
        Stack_BaseCompute_224 stack_BaseCompute_224 = new Stack_BaseCompute_224();
        assertEquals(2, stack_BaseCompute_224.calculate("1 + 1"));

        stack_BaseCompute_224 = new Stack_BaseCompute_224();
        assertEquals(3, stack_BaseCompute_224.calculate("2-1 + 2"));

        stack_BaseCompute_224 = new Stack_BaseCompute_224();
        assertEquals(23, stack_BaseCompute_224.calculate("(1+(4+5+2)-3)+(6+8)"));

        stack_BaseCompute_224 = new Stack_BaseCompute_224();
        assertEquals(2147483647, stack_BaseCompute_224.calculate("2147483647"));

        stack_BaseCompute_224 = new Stack_BaseCompute_224();
        assertEquals(-10, stack_BaseCompute_224.calculate("1-11"));

    }
}