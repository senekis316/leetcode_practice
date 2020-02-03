package practice.leecode.Arrays;

public class OddCells_1252 {

    private int[][] nums;

    public int oddCells(int n, int m, int[][] indices) {
        nums = new int[n][m];
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            oddCells(row, col, n, m);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums[i][j] % 2 == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    private void oddCells(int row, int col, int n, int m) {
        for (int i = 0; i < m; i++) {
            nums[row][i]++;
        }
        for (int i = 0; i < n; i++) {
            nums[i][col]++;
        }
    }

}
