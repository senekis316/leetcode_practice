package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicates_26Test {

    @Test
    public void removeDuplicates() {
        RemoveDuplicates_26 removeDuplicates_26 = new RemoveDuplicates_26();
        assertEquals(5, removeDuplicates_26.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }
}