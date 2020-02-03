package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class Transpose_867Test {

    @Test
    public void transpose_1() {
        int[][] input = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] output = new int[][]{{1,4,7},{2,5,8},{3,6,9}};
        Transpose_867 Transpose_867 = new Transpose_867();
        assertArrayEquals(output, Transpose_867.transpose(input));
    }

    @Test
    public void transpose_2() {
        int[][] input = new int[][]{{1,2,3},{4,5,6}};
        int[][] output = new int[][]{{1,4},{2,5},{3,6}};
        Transpose_867 Transpose_867 = new Transpose_867();
        assertArrayEquals(output, Transpose_867.transpose(input));
    }


}