package practice.leecode.BinarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindRotateMinTest {

    @Test
    public void findMin() {

        FindRotateMin findRotateMin = new FindRotateMin();
        assertEquals(1, findRotateMin.findMin(new int[]{3,4,5,1,2}));
        assertEquals(0, findRotateMin.findMin(new int[]{4,5,6,7,0,1,2}));
        assertEquals(1, findRotateMin.findMin(new int[]{2,3,4,5,1}));

    }
}