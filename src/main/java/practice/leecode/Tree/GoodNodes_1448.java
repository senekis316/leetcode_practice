package practice.leecode.Tree;

import practice.utils.TreeNode;

public class GoodNodes_1448 {

    public int goodNodes(TreeNode root) {
        return tree(root, Integer.MIN_VALUE);
    }

    private int tree(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }
        int count = root.val >= max ? 1: 0;
        max = Math.max(root.val, max);
        return count + tree(root.left, max) + tree(root.right, max);
    }

}
