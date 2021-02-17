package practice.leecode.Matrix;

public class MatrixReshape_566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) {
            return nums;
        }
        int idx = 0;
        int[][] res = new int[r][c];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                int row = idx / c;
                int col = idx % c;
                res[row][col] = nums[i][j];
                idx++;
            }
        }
        return res;
    }

}
