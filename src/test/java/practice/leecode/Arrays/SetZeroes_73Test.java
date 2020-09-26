package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetZeroes_73Test {

    @Test
    public void setZeroes_1() {
        SetZeroes_73 setZeroes_73 = new SetZeroes_73();
        int[][] matrix = new int[][]{{1,1,1}, {1,0,1}, {1,1,1}};
        setZeroes_73.setZeroes(matrix);
        int[][] expect = new int[][]{{1,0,1}, {0,0,0}, {1,0,1}};
        assertArrayEquals(expect, matrix);
    }

    @Test
    public void setZeroes_2() {
        SetZeroes_73 setZeroes_73 = new SetZeroes_73();
        int[][] matrix = new int[][]{{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        setZeroes_73.setZeroes(matrix);
        int[][] expect = new int[][]{{0,0,0,0}, {0,4,5,0}, {0,3,1,0}};
        assertArrayEquals(expect, matrix);
    }

    @Test
    public void setZeroes_3() {
        SetZeroes_73 setZeroes_73 = new SetZeroes_73();
        int[][] matrix = new int[][]{{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
        setZeroes_73.setZeroes(matrix);
        int[][] expect = new int[][]{{0,0,3,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        assertArrayEquals(expect, matrix);
    }

    @Test
    public void setZeroes_4() {
        SetZeroes_73 setZeroes_73 = new SetZeroes_73();
        int[][] matrix = new int[][]{{1,0,3}};
        setZeroes_73.setZeroes(matrix);
        int[][] expect = new int[][]{{0,0,0}};
        assertArrayEquals(expect, matrix);
    }

}