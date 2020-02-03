package practice.leecode.Tree;

import practice.utils.TreeNode;

public class InsertIntoBST_701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        insertIntoBST(val, root);
        return root;
    }

    private void insertIntoBST(int val, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.val > val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
                return;
            }
            insertIntoBST(val, root.left);
        } else {
            if (root.right == null) {
                root.right = new TreeNode(val);
                return;
            }
            insertIntoBST(val, root.right);
        }
    }

}
