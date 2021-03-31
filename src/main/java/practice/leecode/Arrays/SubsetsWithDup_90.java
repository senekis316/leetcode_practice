package practice.leecode.Arrays;

import java.util.*;


public class SubsetsWithDup_90 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                List<Integer> sub = new ArrayList<>(res.get(j));
                sub.add(nums[i]);
                if (!set.contains(sub)) {
                    set.add(sub);
                    res.add(new ArrayList<>(sub));
                } else {
                    sub.remove(sub.size() - 1);
                }
            }
        }
        return res;
    }

}
