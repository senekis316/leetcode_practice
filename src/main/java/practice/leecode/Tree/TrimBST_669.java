package practice.leecode.Tree;

import practice.utils.TreeNode;

public class TrimBST_669 {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root != null) {
           if (root.val < L) {
               return trimBST(root.right, L, R);
           } else if (root.val > R) {
               return trimBST(root.left, L, R);
           } else {
               root.left = trimBST(root.left, L, R);
               root.right = trimBST(root.right, L, R);
           }
        }
        return root;
    }

}
