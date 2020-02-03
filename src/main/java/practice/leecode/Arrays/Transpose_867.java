package practice.leecode.Arrays;

public class Transpose_867 {

    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] nums = new int[col][row];
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                nums[j][i] = matrix[i][j];
            }
        }
        return nums;
    }

}
