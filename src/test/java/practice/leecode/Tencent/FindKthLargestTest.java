package practice.leecode.Tencent;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindKthLargestTest {

    @Test
    public void findKthLargest() {

        FindKthLargest findKthLargest = new FindKthLargest();
        assertEquals(5, findKthLargest.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        assertEquals(4, findKthLargest.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
        assertEquals(99, findKthLargest.findKthLargest(new int[]{99,99}, 1));

    }
}