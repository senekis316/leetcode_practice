package practice.leecode.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStack_255Test {

    @Test
    public void MyStack_255_1() {
        MyStack_255 myStack_255 = new MyStack_255();
        assertTrue(myStack_255.empty());

        myStack_255.push(1);
        myStack_255.push(2);
        assertFalse(myStack_255.empty());

        assertEquals(2, myStack_255.top());
        assertEquals(2, myStack_255.pop());

        assertFalse(myStack_255.empty());
        assertEquals(1, myStack_255.pop());

        assertTrue(myStack_255.empty());
    }

}