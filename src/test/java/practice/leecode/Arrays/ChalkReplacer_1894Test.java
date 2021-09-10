package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChalkReplacer_1894Test {

    @Test
    public void chalkReplacer_1() {
        ChalkReplacer_1894 chalkReplacer_1894 = new ChalkReplacer_1894();
        assertEquals(0, chalkReplacer_1894.chalkReplacer(new int[]{5,1,5}, 22));
    }

    @Test
    public void chalkReplacer_2() {
        ChalkReplacer_1894 chalkReplacer_1894 = new ChalkReplacer_1894();
        assertEquals(1, chalkReplacer_1894.chalkReplacer(new int[]{3,4,1,2}, 25));
    }

}