package practice.leecode.qq.BackTrackAlgorithm;

import java.util.ArrayList;
import java.util.List;


public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList());

        for (int num: nums) {
            int size = subsets.size();
            for (int i=0; i<size; i++) {
                List<Integer> subset = new ArrayList(subsets.get(i));
                subset.add(num);
                subsets.add(subset);
            }
        }

        return subsets;

    }

    //-----全排列-----
    /*public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        boolean[] visited = GetVisitedArray.getVisitedArray(nums);
        subsets(nums, visited, subsets);
        return subsets;
    }

    private void subsets(int[] nums, boolean[] visited, List<List<Integer>> subsets) {
        for (int length = 1; length <= nums.length; length++) {
            subsets(nums, length, visited, new ArrayList<>(), subsets);
        }
    }

    private void subsets(int[] nums, int length, boolean[] visited, List<Integer> sub, List<List<Integer>> subsets) {
        if (sub.size() == length) {
            subsets.add(new ArrayList<>(sub));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!visited[i] && sub.size() + 1 <= length) {
                    visited[i] = true;
                    sub.add(nums[i]);
                    subsets(nums, length, visited, sub, subsets);
                    visited[i] = false;
                    sub.remove(sub.size() - 1);
                }
            }
        }
    }*/

}
