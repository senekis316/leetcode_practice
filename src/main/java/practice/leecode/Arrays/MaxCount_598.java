package practice.leecode.Arrays;

public class MaxCount_598 {

    public int maxCount(int m, int n, int[][] ops) {
        int minx = m;
        int miny = n;
        for (int[] op : ops) {
            minx = Math.min(minx, op[0]);
            miny = Math.min(miny, op[1]);
        }
        return minx * miny;
    }

}
