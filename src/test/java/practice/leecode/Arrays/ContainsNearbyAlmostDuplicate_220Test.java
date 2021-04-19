package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsNearbyAlmostDuplicate_220Test {

    @Test
    public void containsNearbyAlmostDuplicate_1() {
        ContainsNearbyAlmostDuplicate_220 containsNearbyAlmostDuplicate_220 = new ContainsNearbyAlmostDuplicate_220();
        assertTrue(containsNearbyAlmostDuplicate_220.containsNearbyAlmostDuplicate(new int[]{1,2,3,1}, 3, 0));
    }

    @Test
    public void containsNearbyAlmostDuplicate_2() {
        ContainsNearbyAlmostDuplicate_220 containsNearbyAlmostDuplicate_220 = new ContainsNearbyAlmostDuplicate_220();
        assertTrue(containsNearbyAlmostDuplicate_220.containsNearbyAlmostDuplicate(new int[]{1,0,1,1}, 1, 2));
    }

    @Test
    public void containsNearbyAlmostDuplicate_3() {
        ContainsNearbyAlmostDuplicate_220 containsNearbyAlmostDuplicate_220 = new ContainsNearbyAlmostDuplicate_220();
        assertFalse(containsNearbyAlmostDuplicate_220.containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,9}, 2, 3));
    }

    @Test
    public void containsNearbyAlmostDuplicate_4() {
        ContainsNearbyAlmostDuplicate_220 containsNearbyAlmostDuplicate_220 = new ContainsNearbyAlmostDuplicate_220();
        assertFalse(containsNearbyAlmostDuplicate_220.containsNearbyAlmostDuplicate(new int[]{-2147483648,2147483647}, 1, 1));
    }

}