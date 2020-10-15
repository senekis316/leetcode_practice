package practice.leecode.Arrays;

public class MaxProduct_152 {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int t_min = 1;
        int t_max = 1;
        for (int num : nums) {
            if (num < 0) {
                t_min = t_min ^ t_max;
                t_max = t_min ^ t_max;
                t_min = t_min ^ t_max;
            }
            t_min = Math.min(t_min * num, num);
            t_max = Math.max(t_max * num, num);
            max = Math.max(max, t_max);
        }
        return max;
    }

}
