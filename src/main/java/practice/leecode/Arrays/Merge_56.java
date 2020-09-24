package practice.leecode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Merge_56 {

    private List<List<Integer>> betweens;

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        quick_sort(intervals, 0, intervals.length - 1);
        betweens = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            List<Integer> element = new ArrayList<>();
            if (betweens.size() > 0 && betweens.get(betweens.size() - 1).get(1) >= intervals[i][0]) {
                List<Integer> between = betweens.get(betweens.size() - 1);
                element.add(Math.min(between.get(0), intervals[i][0]));
                element.add(Math.max(between.get(1), intervals[i][1]));
                betweens.set(betweens.size() - 1, element);
            } else {
                element.add(intervals[i][0]);
                element.add(intervals[i][1]);
                betweens.add(element);
            }
        }
        int[][] res = new int[betweens.size()][2];
        for (int i = 0; i < res.length; i++) {
            res[i][0] = betweens.get(i).get(0);
            res[i][1] = betweens.get(i).get(1);
        }
        return res;
    }

    private void quick_sort(int[][] nums, int l, int r) {
        if (l < r) {
            int i = l, j = r;
            int[] m = nums[l];
            while (i < j) {
                while (i < j && compare(nums[j], m) >= 0) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while (i < j && compare(nums[i], m) < 0) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = m;
            quick_sort(nums, l, i - 1);
            quick_sort(nums, i + 1, r);
        }
    }

    private int compare(int[] m1, int[] m2) {
        if (m1[0] < m2[0]) {
            return -1;
        } else if (m1[0] == m2[0]) {
            if (m1[1] < m2[1]) {
                return -1;
            } else if (m1[1] == m2[1]) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

}
