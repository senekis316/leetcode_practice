package practice.leecode;

import java.util.ArrayList;
import java.util.List;

public class MinimumTotal_120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 1) return triangle.get(0).get(0);
        List<Integer> prev = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        prev.add(triangle.get(0).get(0));
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < prev.size(); j++) {
                if (j == 0) {
                    curr.add(prev.get(j) + triangle.get(i).get(j));
                }
                curr.add(prev.get(j) + triangle.get(i).get(j + 1));
            }
            prev = curr;
            curr = new ArrayList<>();
        }
        int min = Integer.MAX_VALUE;
        for (Integer num : prev) {
            min = Math.min(min, num);
        }
        return min;
    }

}
