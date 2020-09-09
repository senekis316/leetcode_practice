package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchMatrix_240Test {

    @Test
    public void searchMatrix() {
        int[][] matrix = new int[][]{
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        SearchMatrix_240 searchMatrix_240 = new SearchMatrix_240();
        assertTrue(searchMatrix_240.searchMatrix(matrix, 5));
        assertFalse(searchMatrix_240.searchMatrix(matrix, 20));
    }

}