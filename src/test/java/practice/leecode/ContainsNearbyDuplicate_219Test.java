package practice.leecode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsNearbyDuplicate_219Test {

    @Test
    public void containsNearbyDuplicate() {
        ContainsNearbyDuplicate_219 containsNearbyDuplicate_219 = new ContainsNearbyDuplicate_219();
        assertEquals(true, containsNearbyDuplicate_219.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
        assertEquals(true, containsNearbyDuplicate_219.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
        assertEquals(false, containsNearbyDuplicate_219.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}