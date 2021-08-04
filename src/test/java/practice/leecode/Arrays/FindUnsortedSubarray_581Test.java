package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindUnsortedSubarray_581Test {

    @Test
    public void findUnsortedSubarray_1() {
        FindUnsortedSubarray_581 findUnsortedSubarray_581 = new FindUnsortedSubarray_581();
        assertEquals(5, findUnsortedSubarray_581.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }

    @Test
    public void findUnsortedSubarray_2() {
        FindUnsortedSubarray_581 findUnsortedSubarray_581 = new FindUnsortedSubarray_581();
        assertEquals(4, findUnsortedSubarray_581.findUnsortedSubarray(new int[]{1, 3, 5, 2, 4}));
    }

    @Test
    public void findUnsortedSubarray_3() {
        FindUnsortedSubarray_581 findUnsortedSubarray_581 = new FindUnsortedSubarray_581();
        assertEquals(0, findUnsortedSubarray_581.findUnsortedSubarray(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void findUnsortedSubarray_4() {
        FindUnsortedSubarray_581 findUnsortedSubarray_581 = new FindUnsortedSubarray_581();
        assertEquals(0, findUnsortedSubarray_581.findUnsortedSubarray(new int[]{1, 2, 3, 3, 3}));
    }

    @Test
    public void findUnsortedSubarray_5() {
        FindUnsortedSubarray_581 findUnsortedSubarray_581 = new FindUnsortedSubarray_581();
        assertEquals(2, findUnsortedSubarray_581.findUnsortedSubarray(new int[]{1,3,2,3,3}));
    }

}