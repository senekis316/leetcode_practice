package practice.leecode.Arrays;

import java.util.*;


public class SubsetsWithDup_90 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        dfsAns(0, new ArrayList<>(), nums, ans);
        return ans;
    }

    public void dfsAns(int deep, List<Integer> path, int[] nums, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(path));
        for (int i = deep; i < nums.length; i++) {
            if (i > deep && nums[i] == nums[i - 1]) continue;
            path.add(nums[i]);
            dfsAns(deep + 1, path, nums, ans);
            path.remove(path.size() - 1);
        }
    }

//    public List<List<Integer>> subsetsWithDup(int[] nums) {
//        List<List<Integer>> ans=new ArrayList<>();
//        Arrays.sort(nums);
//        getAns(nums,0,new ArrayList<>(),ans);
//        return ans;
//    }

    private void getAns(int[] nums,int start, ArrayList<Integer> tmp, List<List<Integer>> ans){
        ans.add(new ArrayList<>(tmp));
        for(int i = start;i < nums.length;i++){
            if(i>start&&nums[i]==nums[i-1])continue;
            tmp.add(nums[i]);
            getAns(nums,i+1,tmp,ans);
            tmp.remove(tmp.size()-1);
        }
    }

//    public List<List<Integer>> subsetsWithDup(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> res = new ArrayList<>();
//        res.add(new ArrayList<>());
//        Set<List<Integer>> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            int size = res.size();
//            for (int j = 0; j < size; j++) {
//                List<Integer> sub = new ArrayList<>(res.get(j));
//                sub.add(nums[i]);
//                if (!set.contains(sub)) {
//                    set.add(sub);
//                    res.add(new ArrayList<>(sub));
//                } else {
//                    sub.remove(sub.size() - 1);
//                }
//            }
//        }
//        return res;
//    }

}
