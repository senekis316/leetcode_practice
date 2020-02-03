package practice.leecode.HashMap;

import static org.junit.Assert.*;

import org.junit.Test;

public class Intersection_349Test {

    @Test
    public void intersection() {
        Intersection_349 Intersection_349 = new Intersection_349();
        assertArrayEquals(new int[]{2}, Intersection_349.intersection(new int[]{1,2,2,1}, new int[]{2,2}));
        assertArrayEquals(new int[]{4,9}, Intersection_349.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4}));

    }
}