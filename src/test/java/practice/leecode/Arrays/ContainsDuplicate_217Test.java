package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainsDuplicate_217Test {

    @Test
    public void containsDuplicate_1() {
        ContainsDuplicate_217 ContainsDuplicate_217 = new ContainsDuplicate_217();
        assertTrue(ContainsDuplicate_217.containsDuplicate(new int[]{1,2,3,1}));
    }

    @Test
    public void containsDuplicate_2() {
        ContainsDuplicate_217 ContainsDuplicate_217 = new ContainsDuplicate_217();
        assertFalse(ContainsDuplicate_217.containsDuplicate(new int[]{1,2,3,4}));
    }

    @Test
    public void containsDuplicate_3() {
        ContainsDuplicate_217 ContainsDuplicate_217 = new ContainsDuplicate_217();
        assertTrue(ContainsDuplicate_217.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

}