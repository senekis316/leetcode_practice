package practice.leecode.Arrays;

public class MaxProfit_122 {

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int sub = prices[i] - prices[i - 1];
            if (sub > 0) {
                max += sub;
            }
        }
        return max;
    }

}
