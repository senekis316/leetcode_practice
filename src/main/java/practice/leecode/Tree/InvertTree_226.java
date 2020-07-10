package practice.leecode.Tree;

import practice.utils.TreeNode;

public class InvertTree_226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        invertTree(root.left);
        invertTree(root.right);

        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        return root;
    }

}
