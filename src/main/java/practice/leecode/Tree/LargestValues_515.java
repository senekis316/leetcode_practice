package practice.leecode.Tree;

import java.util.ArrayList;
import java.util.List;
import practice.utils.TreeNode;

public class LargestValues_515 {

    public List<Integer> largestValues(TreeNode root) {
        return largestValues(root, 0, new ArrayList<>());
    }

    private List<Integer> largestValues(TreeNode root, int level, List<Integer> larges) {
        if (root == null) {
            return larges;
        }
        if (larges.size() == level) {
            larges.add(root.val);
        } else {
            larges.set(level, Math.max(root.val, larges.get(level)));
        }
        largestValues(root.left, level + 1, larges);
        largestValues(root.right, level + 1, larges);
        return larges;
    }

}
