package practice.leecode.Tree;

import practice.utils.TreeNode;

public class DiameterOfBinaryTree_543 {

    private int max;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        max = 0;
        treeDeep(root);
        return max;
    }

    private int treeDeep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = treeDeep(root.left);
        int right = treeDeep(root.right);
        max = Math.max(left + right, max);
        return Math.max(left, right) + 1;
    }

}
