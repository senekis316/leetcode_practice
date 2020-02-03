package practice.leecode.Arrays;

public class IsToeplitzMatrix_766 {

    // 方法二: 数学
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    // 方法一: 遍历
    /*public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int r = i + 1, c = 1; r < matrix.length && c < matrix[0].length; r++, c++) {
                if (matrix[i][0] != matrix[r][c]) {
                    return false;
                }
            }
        }
        for (int i = 1; i < matrix[0].length; i++) {
            for (int r = 1, c = i + 1; r < matrix.length && c < matrix[0].length; r++, c++) {
                if (matrix[0][i] != matrix[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }*/

}
