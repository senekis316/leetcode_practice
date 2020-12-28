package practice.leecode.Dynamic;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxProfit_181 {

//    public int maxProfit(int k, int[] prices) {
//        List<Profit> profits = new ArrayList<>(prices.length - 1);
//        for (int i = 1; i < prices.length; i++) {
//            profits.add(new Profit(i - 1, prices[i] - prices[i - 1]));
//        }
//        profits.sort(Comparator.comparingInt(Profit::getProfit));
//        List<Integer> points =  profits.stream().limit(k)
//            .sorted(Comparator.comparingInt(Profit::getIndex))
//            .map(Profit::getIndex).collect(Collectors.toList());
//        int sum = 0;
//        for (int i = 0; i < points.size(); i++) {
//            if (i == 0) {
//                sum += maxProfit2(1, points.stream().limit(2).mapToInt(p -> p.intValue()).toArray());
//            }
//        }
//        return sum;
//    }
//
//    @Data
//    public class Profit {
//        private int index;
//        private int profit;
//        public Profit(int index, int profit) {
//            this.index = index;
//            this.profit = profit;
//        }
//    }

    public int maxProfit(int k, int[] prices) {
        int sum = 0;
        List<Integer> profits = new ArrayList<>();
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i - 1];
            if (profit >= 0) {
                sum += profit;
            } else {
                profits.add(sum);
                sum = 0;
            }
        }
        profits.add(sum);
        return profits.stream().sorted(Comparator.reverseOrder()).limit(k).reduce((n1, n2) -> n1 + n2).get();
    }

}
