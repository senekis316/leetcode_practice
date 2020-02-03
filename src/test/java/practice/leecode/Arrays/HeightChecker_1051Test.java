package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeightChecker_1051Test {

    @Test
    public void heightChecker() {
        int[] heights = new int[]{1,1,4,2,1,3};
        HeightChecker_1051 HeightChecker_1051 = new HeightChecker_1051();
        assertEquals(3, HeightChecker_1051.heightChecker(heights));
    }
}