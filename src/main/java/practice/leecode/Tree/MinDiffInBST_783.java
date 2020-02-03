package practice.leecode.Tree;

import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MinDiffInBST_783 {

    private Integer min;

    public int minDiffInBST(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        min = Integer.MAX_VALUE;
        return middleOrder(root, new ArrayList<>());
    }

    private int middleOrder(TreeNode root, List<Integer> nodes) {
        if (root == null) {
            return min;
        }
        middleOrder(root.left, nodes);
        nodes.add(root.val);
        if (nodes.size() >= 2) {
            int diff = Math.abs(nodes.get(nodes.size()-1) - nodes.get(nodes.size()-2));
            min = Math.min(min, diff);
        }
        middleOrder(root.right, nodes);
        return min;
    }

}
