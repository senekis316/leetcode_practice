package practice.leecode.Sort;

public class KClosest_973 {

    public int[][] kClosest(int[][] points, int K) {
        int[][] pos = new int[points.length][3];
        for (int i = 0; i < points.length; i++) {
            pos[i][0] = points[i][0];
            pos[i][1] = points[i][1];
            pos[i][2] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
        }
        quick_sort(0, pos.length - 1, pos);
        int[][] res = new int[K][2];
        for (int i = 0; i < res.length; i++) {
            res[i][0] = pos[i][0];
            res[i][1] = pos[i][1];
        }
        return res;
    }

    private void quick_sort(int l, int r, int[][] pos) {
        if (l < r) {
            int i = l, j = r;
            int[] m = pos[l];
            while (i < j) {
                while (i < j && pos[j][2] >= m[2]) {
                    j--;
                }
                if (i < j) {
                    pos[i++] = pos[j];
                }
                while (i < j && pos[i][2] < m[2]) {
                    i++;
                }
                if (i < j) {
                    pos[j--] = pos[i];
                }
            }
            pos[i] = m;
            quick_sort(l, i - 1, pos);
            quick_sort(i + 1, r, pos);
        }
    }

}
