package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicates_80Test {

    @Test
    public void removeDuplicates_1() {
        RemoveDuplicates_80 removeDuplicates_80 = new RemoveDuplicates_80();
        assertEquals(5, removeDuplicates_80.removeDuplicates(new int[]{1,1,1,2,2,3}));
    }

    @Test
    public void removeDuplicates_2() {
        RemoveDuplicates_80 removeDuplicates_80 = new RemoveDuplicates_80();
        assertEquals(7, removeDuplicates_80.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }

}