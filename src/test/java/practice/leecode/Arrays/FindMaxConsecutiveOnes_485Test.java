package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxConsecutiveOnes_485Test {

    @Test
    public void findMaxConsecutiveOnes() {
        FindMaxConsecutiveOnes_485 findMaxConsecutiveOnes_485 = new FindMaxConsecutiveOnes_485();
        assertEquals(3, findMaxConsecutiveOnes_485.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }

}