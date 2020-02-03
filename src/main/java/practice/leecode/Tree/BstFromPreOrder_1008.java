package practice.leecode.Tree;

import practice.utils.TreeNode;

public class BstFromPreOrder_1008 {

    public TreeNode bstFromPreOrder(int[] preOrder) {
        TreeNode root = new TreeNode(preOrder[0]);
        for (int i = 1; i < preOrder.length; i++) {
            bstFromPreOrder(preOrder[i], root);
        }
        return root;
    }

    private void bstFromPreOrder(int val, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.val > val) {
            bstFromPreOrder(val, root.left);
        }
        if (root.right != null && root.val < val) {
            bstFromPreOrder(val, root.right);
        }
        if (root.left == null && root.val > val) {
            root.left = new TreeNode(val);
            return;
        }
        if (root.right == null && root.val < val) {
            root.right = new TreeNode(val);
            return;
        }
    }

}
