package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenerateMatrix_59Test {

    @Test
    public void generateMatrix_1() {
        GenerateMatrix_59 GenerateMatrix_59 = new GenerateMatrix_59();
        int[][] res = GenerateMatrix_59.generateMatrix(3);
        assertEquals(9, res[1][1]);
    }

    @Test
    public void generateMatrix_2() {
        GenerateMatrix_59 GenerateMatrix_59 = new GenerateMatrix_59();
        int[][] res = GenerateMatrix_59.generateMatrix(4);
        assertEquals(5, res[1][3]);
    }
}