package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsToeplitzMatrix_766Test {

    @Test
    public void isToeplitzMatrix_1() {
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        IsToeplitzMatrix_766 IsToeplitzMatrix_766 = new IsToeplitzMatrix_766();
        assertTrue(IsToeplitzMatrix_766.isToeplitzMatrix(matrix));
    }

    @Test
    public void isToeplitzMatrix_2() {
        int[][] matrix = {{1,2},{2,2}};
        IsToeplitzMatrix_766 IsToeplitzMatrix_766 = new IsToeplitzMatrix_766();
        assertFalse(IsToeplitzMatrix_766.isToeplitzMatrix(matrix));
    }

    @Test
    public void isToeplitzMatrix_3() {
        int[][] matrix =
            {
                {36,59,71,15,26,82,87},
                {56,36,59,71,15,26,82},
                {15,0,36,59,71,15,26}
            };
        IsToeplitzMatrix_766 IsToeplitzMatrix_766 = new IsToeplitzMatrix_766();
        assertFalse(IsToeplitzMatrix_766.isToeplitzMatrix(matrix));
    }


}