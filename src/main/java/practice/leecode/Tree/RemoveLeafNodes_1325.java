package practice.leecode.Tree;

import practice.utils.TreeNode;

public class RemoveLeafNodes_1325 {

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root.left != null) {
            root.left = removeLeafNodes(root.left, target);
        }
        if (root.right != null) {
            root.right = removeLeafNodes(root.right, target);
        }
        if (root.val == target && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }


    /*public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root.left != null) {
            removeLeafNodes(root.left, target);
        }
        if (root.right != null) {
            removeLeafNodes(root.right, target);
        }
        if (root.left != null && root.left.val == target && root.left.left == null && root.left.right == null ) {
            root.left = null;
        }
        if (root.right != null && root.right.val == target && root.right.left == null && root.right.right == null) {
            root.right = null;
        }
        return root;
     }*/


}
