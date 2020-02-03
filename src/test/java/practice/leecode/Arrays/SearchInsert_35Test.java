package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsert_35Test {

    @Test
    public void searchInsert1() {
        SearchInsert_35 searchInsert_35 = new SearchInsert_35();
        assertEquals(2, searchInsert_35.searchInsert(new int[]{1,3,5,6}, 5));
    }

    @Test
    public void searchInsert2() {
        SearchInsert_35 searchInsert_35 = new SearchInsert_35();
        assertEquals(1, searchInsert_35.searchInsert(new int[]{1,3,5,6}, 2));
    }

    @Test
    public void searchInsert3() {
        SearchInsert_35 searchInsert_35 = new SearchInsert_35();
        assertEquals(4, searchInsert_35.searchInsert(new int[]{1,3,5,6}, 7));
    }

    @Test
    public void searchInsert4() {
        SearchInsert_35 searchInsert_35 = new SearchInsert_35();
        assertEquals(0, searchInsert_35.searchInsert(new int[]{1,3,5,6}, 0));
    }
}