package practice.leecode.Tree;


public class GetKth_1387 {

    public int getKth(int lo, int hi, int k) {
        int[][] values = new int[hi - lo + 1][2];
        for (int i = 0; i < values.length; i++) {
            int value = lo + i;
            values[i] = new int[] {value, getWeight(value)};
        }
        quick_sort(0, values.length - 1, values);
        return values[k - 1][0];
    }

    private void quick_sort(int l, int r, int[][] nums) {
        if (l < r) {
            int i = l, j = r;
            int[] m = nums[l];
            while(i < j) {
                while (i < j && compare(m, nums[j]) >= 0) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while (i < j && compare(m, nums[i]) < 0) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = m;
            quick_sort(l, i - 1, nums);
            quick_sort(i + 1, r, nums);
        }
    }

    private int compare(int[] mid, int[] cur) {
        if (mid[1] == cur[1]) {
            if (mid[0] == cur[0]) return 0;
            return mid[0] < cur[0] ? 1 : -1;
        }
        return mid[1] < cur[1] ? 1 : -1;
    }

    public int getWeight(int value) {
        int w = 0;
        for (int v = value; v > 1; w++) {
            v = v % 2 == 0 ? v / 2 : 3 * v + 1;
        }
        return w;
    }

}
