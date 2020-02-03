package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumRookCaptures_999Test {

    @Test
    public void numRookCaptures() {

        char[][] input = new char[][]{
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','p','.','.','.','.'},
            {'.','.','.','R','.','.','.','p'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','p','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'}
        };
        NumRookCaptures_999 NumRookCaptures_999 = new NumRookCaptures_999();
        assertEquals(3, NumRookCaptures_999.numRookCaptures(input));
    }
}