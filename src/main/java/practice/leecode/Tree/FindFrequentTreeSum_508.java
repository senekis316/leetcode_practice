package practice.leecode.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import practice.utils.TreeNode;

public class FindFrequentTreeSum_508 {

    private Map<Integer, Integer> frequents;

    public int[] findFrequentTreeSum(TreeNode root) {
        frequents = new HashMap<>();
        findFrequent(root);
        return maxFrequests();
    }

    private int findFrequent(TreeNode root) {
        if (root == null) return 0;
        int sum = root.val + findFrequent(root.left) + findFrequent(root.right);
        frequents.put(sum, frequents.getOrDefault(sum, 0) + 1);
        return sum;
    }

    private int[] maxFrequests() {
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry: frequents.entrySet()) {
            if (max < entry.getValue()) {
                list.clear();
                list.add(entry.getKey());
                max = entry.getValue();
            } else if (max == entry.getValue()) {
                list.add(entry.getKey());
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
