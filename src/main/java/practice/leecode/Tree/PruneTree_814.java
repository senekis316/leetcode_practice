package practice.leecode.Tree;

import practice.utils.TreeNode;

public class PruneTree_814 {

    public TreeNode pruneTree(TreeNode root) {
        prune(root);
        return root;
    }

    private boolean prune(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean pl = prune(root.left);
        boolean pr = prune(root.right);
        if (pl) {
            root.left = null;
        }
        if (pr) {
            root.right = null;
        }
        if (root.val == 0 && pl && pr) {
            return true;
        }
        return false;
    }

}
