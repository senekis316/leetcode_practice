package practice.leecode.Arrays;

public class CountNegatives_1351 {

    public int countNegatives(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] >= 0) {
                   break;
                }
                count++;
            }
        }
        return count;
    }

}
