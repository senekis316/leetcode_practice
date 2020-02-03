package practice.leecode.Tree;

import practice.utils.TreeNode;

public class DeepestLeavesSum_5153 {

    private int sum;
    private int max;

    public int deepestLeavesSum(TreeNode root) {
        sum = 0;
        max = 0;
        deepestLeavesSum(1, root);
        return sum;
    }

    private int deepestLeavesSum(int level, TreeNode root) {
        if (root == null) {
            return sum;
        }
        if (level > max) {
            max = level;
            sum = 0;
        }
        if (level == max) {
            sum += root.val;
        }
        deepestLeavesSum(level + 1, root.left);
        deepestLeavesSum(level + 1, root.right);
        return sum;
    }

}
