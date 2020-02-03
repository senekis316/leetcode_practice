package practice.leecode;

import practice.leecode.Common.TreeNode;

public class HasPathSum_112 {


    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum - root.val == 0;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    /*private boolean hasPathSum = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        this.hasPathSum = false;
        hasPathSumTree(root, sum);
        return hasPathSum;
    }

    private void hasPathSumTree(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        if (hasPathSum) {
            return;
        }
        sum = sum - root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            this.hasPathSum = true;
            return;
        }
        hasPathSumTree(root.left, sum);
        hasPathSumTree(root.right, sum);
    }*/

}
