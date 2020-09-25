package practice.leecode.Arrays;

import java.util.Arrays;

public class UniquePaths_62 {

    public int uniquePaths(int m, int n) {
        int[] nums = new int[n];
        Arrays.fill(nums, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                nums[j] += nums[j - 1];
            }
        }
        return nums[n - 1];
    }

//    方法1:
//    public int uniquePaths(int m, int n) {
//        int[][] matrix = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 && j == 0) {
//                    matrix[i][j] = 1;
//                } else if (i == 0) {
//                    matrix[i][j] = matrix[i][j - 1];
//                } else if (j == 0) {
//                    matrix[i][j] = matrix[i - 1][j];
//                } else {
//                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
//                }
//            }
//        }
//        return matrix[m - 1][n - 1];
//    }

}
