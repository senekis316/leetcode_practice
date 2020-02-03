package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindSpecialInteger_1287Test {

    @Test
    public void findSpecialInteger() {
        FindSpecialInteger_1287 FindSpecialInteger_1287 = new FindSpecialInteger_1287();
        assertEquals(6, FindSpecialInteger_1287.findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10}));
    }
}