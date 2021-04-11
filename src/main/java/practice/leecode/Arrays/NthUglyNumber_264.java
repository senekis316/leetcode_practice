package practice.leecode.Arrays;

import java.util.*;

public class NthUglyNumber_264 {

    public int nthUglyNumber(int n) {
        Set<Long> set = new HashSet<>();
        PriorityQueue<Long> stack = new PriorityQueue<>();
        stack.add(1l);
        int[] factors = new int[]{2,3,5};
        for (int i = 1; i < n; i++) {
            long num = stack.poll();
            for (int factor : factors) {
                long mul = num * factor;
                if (set.add(mul)) {
                    stack.offer(mul);
                }
            }
        }
        return stack.poll().intValue();
    }

}
