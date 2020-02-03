package practice.leecode.Tree;

import practice.utils.TreeNode;

public class BstToGst_1038 {

    private int sum;

    public TreeNode bstToGst(TreeNode root) {
        sum = 0;
        bst(root);
        return root;
    }

    private void bst(TreeNode root) {
        if (root == null) {
            return;
        }
        bst(root.right);
        sum += root.val;
        root.val = sum;
        bst(root.left);
    }

}
