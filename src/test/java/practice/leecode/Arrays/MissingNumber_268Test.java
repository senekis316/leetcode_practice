package practice.leecode.Arrays;

import junit.framework.TestCase;
import org.junit.Test;

public class MissingNumber_268Test extends TestCase {

    @Test
    public void testMissingNumber_1() {
        MissingNumber_268 missingNumber_268 = new MissingNumber_268();
        assertEquals(2, missingNumber_268.missingNumber(new int[]{3,0,1}));
    }

    @Test
    public void testMissingNumber_2() {
        MissingNumber_268 missingNumber_268 = new MissingNumber_268();
        assertEquals(2, missingNumber_268.missingNumber(new int[]{0,1}));
    }

    @Test
    public void testMissingNumber_3() {
        MissingNumber_268 missingNumber_268 = new MissingNumber_268();
        assertEquals(8, missingNumber_268.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    @Test
    public void testMissingNumber_4() {
        MissingNumber_268 missingNumber_268 = new MissingNumber_268();
        assertEquals(1, missingNumber_268.missingNumber(new int[]{0}));
    }

}