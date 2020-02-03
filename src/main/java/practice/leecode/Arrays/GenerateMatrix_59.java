package practice.leecode.Arrays;

public class GenerateMatrix_59 {

    public int[][] generateMatrix(int n) {
        int num = 1;
        int total = n * n;
        int left = 0;
        int right = n - 1;
        int up = 0;
        int down = n - 1;
        int[][] nums = new int[n][n];
        while (num <= total) {
            for (int i = left; i <= right; i++) {
                nums[up][i] = num++;
            }
            up++;
            for (int i = up; i <= down; i++) {
                nums[i][right] = num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                nums[down][i] = num++;
            }
            down--;
            for (int i = down; i >= up; i--) {
                nums[i][left] = num++;
            }
            left++;
        }
        return nums;
    }

    /*private static final int UP = 0;
    private static final int DOWN = 1;
    private static final int LEFT = 2;
    private static final int RIGHT = 3;

    public int[][] generateMatrix_2(int n) {
        int[][] nums = new int[n][n];
        int max = n * n;
        int x = 0, y = 0;
        int direct = RIGHT;
        int left = 0;
        int right = n - 1;
        int up = 0;
        int down = n - 1;
        for (int num = 1; num <= max; num++) {
            nums[x][y] = num;
            switch(direct) {
                case RIGHT:
                    if (y == right) {
                        x++;
                        up++;
                        direct = DOWN;
                    } else {
                        y++;
                    }
                    break;
                case DOWN:
                    if (x == down) {
                        y--;
                        down--;
                        right--;
                        direct = LEFT;
                    } else {
                        x++;
                    }
                    break;
                case LEFT:
                    if (y == left) {
                        x--;
                        direct = UP;
                    } else {
                        y--;
                    }
                    break;
                case UP:
                    if (x == up) {
                        y++;
                        left++;
                        direct = RIGHT;
                    } else {
                        x--;
                    }
                    break;
            }
        }
        return nums;
    }*/


}
