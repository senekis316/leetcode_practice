package practice.leecode.Bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumber_268Test {

    @Test
    public void missingNumber() {
        MissingNumber_268 missingNumber_268 = new MissingNumber_268();
        assertEquals(1, missingNumber_268.missingNumber(new int[]{0}));
        assertEquals(0, missingNumber_268.missingNumber(new int[]{1}));
        assertEquals(2, missingNumber_268.missingNumber(new int[]{3,0,1}));
        assertEquals(8, missingNumber_268.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}