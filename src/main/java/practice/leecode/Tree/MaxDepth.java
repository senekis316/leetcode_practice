package practice.leecode.Tree;

public class MaxDepth {


    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }


    /*private int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        maxDepth(root, 1);
        return maxDepth;
    }

    private void maxDepth(TreeNode root, int depth) {
        if(root.left != null) {
            maxDepth(root.left, depth + 1);
        }
        if (root.right != null) {
            maxDepth(root.right, depth + 1);
        }
        if (root.left == null && root.right == null) {
            maxDepth = Math.max(maxDepth, depth);
        }
    }*/

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
