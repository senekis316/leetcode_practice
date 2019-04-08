package practice.leecode.Tencent.DynamicProgramming;

public class MaxProfit1 {

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        int max = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(prices[i] - min, max);
            }

        }

        return max;

    }



}
