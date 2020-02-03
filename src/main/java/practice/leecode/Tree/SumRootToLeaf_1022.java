package practice.leecode.Tree;

import practice.utils.TreeNode;

public class SumRootToLeaf_1022 {

    private int all = 0;

    public int sumRootToLeaf(TreeNode root) {
        sumRootToLeaf(root, 0);
        return all;
    }

    private void sumRootToLeaf(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        sum = sum << 1;
        sum = sum | root.val;
        if (root.left == null && root.right == null) {
            all += sum;
        }
        sumRootToLeaf(root.left, sum);
        sumRootToLeaf(root.right, sum);
    }



}
