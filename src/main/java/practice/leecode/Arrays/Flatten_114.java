package practice.leecode.Arrays;

import practice.utils.TreeNode;

public class Flatten_114 {

    TreeNode last = null;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        if (root.left != null) {
            if (last == null) {
                last = root.left;
            }
            while(last.right != null) {
                last = last.right;
            }
            last.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        flatten(root.right);
    }

    /*public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        if (root.left != null) {
            TreeNode temp = root.left;
            while(temp.right != null) {
                temp = temp.right;
            }
            temp.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        flatten(root.right);
    }*/

}
