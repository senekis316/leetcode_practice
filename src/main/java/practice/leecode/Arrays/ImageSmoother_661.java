package practice.leecode.Arrays;

public class ImageSmoother_661 {

    public int[][] imageSmoother(int[][] M) {
        int h = M.length;
        int w = M[0].length;
        int[][] n = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int sum = 0;
                int count = 0;
                if (i - 1 >= 0) {
                    sum += M[i - 1][j];
                    if (j - 1 >= 0) {
                        sum += M[i - 1][j - 1];
                        count++;
                    }
                    if (j + 1 < w) {
                        sum += M[i - 1][j + 1];
                        count++;
                    }
                    count++;
                }
                if (j - 1 >= 0) {
                    sum += M[i][j - 1];
                    count++;
                }
                if (j + 1 < w) {
                    sum += M[i][j + 1];
                    count++;
                }
                if (i + 1 < h) {
                    sum += M[i + 1][j];
                    if (j - 1 >= 0) {
                        sum += M[i + 1][j - 1];
                        count++;
                    }
                    if (j + 1 < w) {
                        sum += M[i + 1][j + 1];
                        count++;
                    }
                    count++;
                }
                sum += M[i][j];
                count++;
                n[i][j] = sum / count;

            }
        }
        return n;
    }

}
