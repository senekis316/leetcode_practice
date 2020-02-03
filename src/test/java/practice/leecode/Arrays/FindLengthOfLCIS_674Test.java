package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLengthOfLCIS_674Test {

    @Test
    public void findLengthOfLCIS_1() {
        FindLengthOfLCIS_674 findLengthOfLCIS_674 = new FindLengthOfLCIS_674();
        assertEquals(3, findLengthOfLCIS_674.findLengthOfLCIS(new int[]{1,3,5,4,7}));
    }

    @Test
    public void findLengthOfLCIS_2() {
        FindLengthOfLCIS_674 findLengthOfLCIS_674 = new FindLengthOfLCIS_674();
        assertEquals(1, findLengthOfLCIS_674.findLengthOfLCIS(new int[]{2,2,2,2,2}));
    }

}