package practice.leecode.Arrays;

import java.util.Arrays;

public class DiagonalSort_1329 {

    public int[][] diagonalSort(int[][] mat) {
        for (int row = 0; row < mat.length - 1; row++) {
            int length = Math.min(mat.length - row, mat[0].length);
            int[] nums = new int[length];
            int pos = 0;
            for (int i = row, j = 0; i < mat.length && j < mat[i].length; i++, j++) {
                nums[pos++] = mat[i][j];
            }
            Arrays.sort(nums);
            pos = 0;
            for (int i = row, j = 0; i < mat.length && j < mat[i].length; i++, j++) {
                mat[i][j] = nums[pos++];
            }
        }
        for (int col = 1; col < mat[0].length - 1; col++) {
            int length = Math.min(mat.length, mat[0].length - col);
            int[] nums = new int[length];
            int pos = 0;
            for (int i = 0, j = col; i < mat.length && j < mat[i].length; i++, j++) {
                nums[pos++] = mat[i][j];
            }
            Arrays.sort(nums);
            pos = 0;
            for (int i = 0, j = col; i < mat.length && j < mat[i].length; i++, j++) {
                mat[i][j] = nums[pos++];
            }
        }
        return mat;
    }



}
