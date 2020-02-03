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

}