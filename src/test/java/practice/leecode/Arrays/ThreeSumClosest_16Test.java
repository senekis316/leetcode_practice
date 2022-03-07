package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumClosest_16Test {

    @Test
    public void threeSumClosest_1() {
        ThreeSumClosest_16 threeSumClosest = new ThreeSumClosest_16();
        assertEquals(2, threeSumClosest.threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }

    @Test
    public void threeSumClosest_2() {
        ThreeSumClosest_16 threeSumClosest = new ThreeSumClosest_16();
        assertEquals(0, threeSumClosest.threeSumClosest(new int[]{0,0,0}, 1));
    }

}