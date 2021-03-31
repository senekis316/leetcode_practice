package practice.leecode.Arrays;

import java.util.List;
import java.util.ArrayList;

public class Subsets_78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                List<Integer> sub = new ArrayList<>(res.get(j));
                sub.add(nums[i]);
                res.add(sub);
            }
        }
        return res;
    }

}
