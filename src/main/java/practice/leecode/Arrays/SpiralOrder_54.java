package practice.leecode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder_54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> nums = new ArrayList<>();
        if (matrix.length == 0) {
            return nums;
        }
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int count = matrix.length * matrix[0].length;
        while (count > 0) {
            for (int i = left; i <= right; i++) {
                nums.add(matrix[top][i]);
                count--;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                nums.add(matrix[i][right]);
                count--;
            }
            right--;
            if (top > bottom || left > right) {
                break;
            }
            for (int i = right; i >= left; i--) {
                nums.add(matrix[bottom][i]);
                count--;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                nums.add(matrix[i][left]);
                count--;
            }
            left++;
        }
        return nums;
    }
}
