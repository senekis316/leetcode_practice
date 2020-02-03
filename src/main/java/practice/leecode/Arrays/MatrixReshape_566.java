package practice.leecode.Arrays;

public class MatrixReshape_566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        if (nums.length * nums[0].length != r * c) return nums;

        int[][] matrix = new int[r][c];

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                matrix[count / c][count % c] = nums[i][j];
                count++;
            }
        }

        return matrix;

    }

}
