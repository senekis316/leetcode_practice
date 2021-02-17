package practice.leecode.Sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargest_703Test {

    @Test
    public void add() {
        KthLargest_703 kthLargest_703 = new KthLargest_703(3, new int[]{4, 5, 8, 2});
        assertEquals(4, kthLargest_703.add(3));
        assertEquals(5, kthLargest_703.add(5));
        assertEquals(5, kthLargest_703.add(10));
        assertEquals(8, kthLargest_703.add(9));
        assertEquals(8, kthLargest_703.add(4));
    }

}