package practice.leecode.Tree;


import practice.utils.TreeNode;

public class IsBalancedTree_110 {

    public boolean isBalanced(TreeNode root) {
        return treeDepth(root) != -1;
    }

    private int treeDepth(TreeNode root) {

        if (root == null) return 0;

        int left = treeDepth(root.left);
        if (left == -1) return -1;

        int right = treeDepth(root.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;

    }

    /*public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (Math.abs(treeDepth(root.left) - treeDepth(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int treeDepth(TreeNode node) {
        return node == null ? 0 : Math.max(treeDepth(node.left), treeDepth(node.right)) + 1;
    }*/

    /*
        public boolean isBalanced(TreeNode root) {
            return depth(root) != -1;
        }

        private int depth(TreeNode root) {
            if (root == null)
                return 0;

            int left = depth(root.left);
            if (left == -1)
                return -1;
            int right = depth(root.right);
            if (right == -1)
                return -1;

            if (Math.abs(left - right) > 1)
                return -1;
            return Math.max(left, right) + 1;
        }
     */

}
