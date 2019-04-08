package practice.leecode.BinarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchRangeTest {

    @Test
    public void searchRange() {
        SearchRange searchRange = new SearchRange();
        assertArrayEquals(new int[]{0,0}, searchRange.searchRange(new int[]{1}, 1));
        assertArrayEquals(new int[]{-1,-1}, searchRange.searchRange(new int[]{2,2}, 3));
        assertArrayEquals(new int[]{3,4}, searchRange.searchRange(new int[]{5,7,7,8,8,10}, 8));
        assertArrayEquals(new int[]{-1,-1}, searchRange.searchRange(new int[]{5,7,7,8,8,10}, 6));
        assertArrayEquals(new int[]{0,1}, searchRange.searchRange(new int[]{2,2}, 2));
    }
}