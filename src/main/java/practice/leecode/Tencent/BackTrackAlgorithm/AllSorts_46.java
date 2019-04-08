package practice.leecode.Tencent.BackTrackAlgorithm;

import java.util.ArrayList;
import java.util.List;


public class AllSorts_46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visits = GetVisitedArray.getVisitedArray(nums);
        List<Integer> temp = new ArrayList<>();
        sorted(nums, visits, temp, result);
        return result;
    }

    private void sorted(int[] nums, boolean[] visits, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
        } else {
            for (int i=0; i<nums.length; i++) {
                if (!visits[i]) {
                   visits[i] = true;
                   temp.add(nums[i]);
                   sorted(nums, visits, temp, result);
                   visits[i] = false;
                   temp.remove(temp.size()-1);
                }
            }
        }
    }

}
