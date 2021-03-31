package practice.leecode.Arrays;

import java.util.*;

public class SubsetsWithDup_90 {

    private List<List<Integer>> res;
    private Map<String, List<Integer>> map;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        map = new HashMap<>();
        res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            String sub = String.valueOf(nums[i]);
            List<Integer> sublist = new ArrayList<>();
            sublist.add(nums[i]);
            if (map.get(sub) == null) {
                map.put(sub, new ArrayList<>(sublist));
                res.add(map.get(sub));
            }
            for (int j = i + 1; j < nums.length; j++) {
                sub = sub + "|" + nums[j];
                sublist.add(nums[j]);
                if (map.get(sub) == null) {
                    map.put(sub, new ArrayList<>(sublist));
                    res.add(map.get(sub));
                }
            }
        }
        return res;
    }

}
