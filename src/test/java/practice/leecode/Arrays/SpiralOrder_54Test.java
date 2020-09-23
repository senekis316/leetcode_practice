package practice.leecode.Arrays;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SpiralOrder_54Test {

    @Test
    public void spiralOrder_1() {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        SpiralOrder_54 spiralOrder_54 = new SpiralOrder_54();
        List<Integer> expect = List.of(1,2,3,6,9,8,7,4,5);
        List<Integer> actual = spiralOrder_54.spiralOrder(matrix);
        assertArrayEquals(expect.toArray(), actual.toArray());
    }

    @Test
    public void spiralOrder_2() {
        int[][] matrix = new int[][]{{7},{9},{6}};
        SpiralOrder_54 spiralOrder_54 = new SpiralOrder_54();
        List<Integer> expect = List.of(7,9,6);
        List<Integer> actual = spiralOrder_54.spiralOrder(matrix);
        assertArrayEquals(expect.toArray(), actual.toArray());
    }

    @Test
    public void spiralOrder_3() {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        SpiralOrder_54 spiralOrder_54 = new SpiralOrder_54();
        List<Integer> expect = List.of(1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10);
        List<Integer> actual = spiralOrder_54.spiralOrder(matrix);
        assertArrayEquals(expect.toArray(), actual.toArray());
    }

}