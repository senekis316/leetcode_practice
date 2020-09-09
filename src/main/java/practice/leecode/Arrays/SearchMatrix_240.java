package practice.leecode.Arrays;

public class SearchMatrix_240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int x = matrix.length - 1;
        int y = 0;
        while (x >= 0 && y < matrix[0].length) {
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] > target) {
                x --;
            } else if (matrix[x][y] < target) {
                y ++;
            }

        }
        return false;
    }

}
