package practice.leecode.Math;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPowerOfThree_326Test {

    @Test
    public void isPowerOfThree_1() {
        IsPowerOfThree_326 isPowerOfThree_326 = new IsPowerOfThree_326();
        assertTrue(isPowerOfThree_326.isPowerOfThree(27));
    }

    @Test
    public void isPowerOfThree_2() {
        IsPowerOfThree_326 isPowerOfThree_326 = new IsPowerOfThree_326();
        assertFalse(isPowerOfThree_326.isPowerOfThree(0));
    }

    @Test
    public void isPowerOfThree_3() {
        IsPowerOfThree_326 isPowerOfThree_326 = new IsPowerOfThree_326();
        assertTrue(isPowerOfThree_326.isPowerOfThree(9));
    }

    @Test
    public void isPowerOfThree_4() {
        IsPowerOfThree_326 isPowerOfThree_326 = new IsPowerOfThree_326();
        assertFalse(isPowerOfThree_326.isPowerOfThree(45));
    }

}