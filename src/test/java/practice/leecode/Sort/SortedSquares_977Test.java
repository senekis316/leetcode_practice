package practice.leecode.Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedSquares_977Test {

    @Test
    public void sortedSquares() {
        int[] nums = {-4,-1,0,3,10};
        SortedSquares_977 SortedSquares_977 = new SortedSquares_977();
        assertArrayEquals(new int[]{0,1,9,16,100}, SortedSquares_977.sortedSquares(nums));
    }
}