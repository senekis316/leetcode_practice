package practice.leecode.Tree;

import practice.utils.TreeNode;

public class InOrPostOrderBuildTree_106 {

    public TreeNode buildTree(int[] inOrder, int[] postOrder) {
        return inOrder != null ? inBuildTree(inOrder, 0) : postBuildTree(postOrder, 0);
    }

    private TreeNode inBuildTree(int[] inOrder, int i) {
        TreeNode root = new TreeNode(inOrder[i++]);
        root.left = new TreeNode(inOrder[i++]);
        root.right = new TreeNode(inOrder[i++]);

        return root;
    }

    private TreeNode postBuildTree(int[] postOrder, int i) {
        TreeNode root = new TreeNode(postOrder[i]);
        return null;
    }

}
