package practice.leecode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Array_NextGreaterElement_496Test {

    @Test
    public void nextGreaterElement() {
        Array_NextGreaterElement_496 array_NextGreaterElement_496 = new Array_NextGreaterElement_496();
        assertArrayEquals(new int[]{-1,3,-1},array_NextGreaterElement_496.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
    }
}