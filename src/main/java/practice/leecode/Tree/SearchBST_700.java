package practice.leecode.Tree;

import practice.utils.TreeNode;

public class SearchBST_700 {

    private TreeNode subTreeNode;

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return subTreeNode;
        }
        searchBST(root.left, val);
        if (root.val == val) {
            subTreeNode = root;
        }
        searchBST(root.right, val);
        return subTreeNode;
    }


}
