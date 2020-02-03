package practice.leecode.Tree;

import practice.utils.TreeNode;

public class SumNumbers_129 {

    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    private int sumNumbers(TreeNode root, int num) {
        if (root == null) {
            return 0;
        }
        num = num * 10 + root.val;
        if (root.left == null && root.right == null) {
            return num;
        }
        return sumNumbers(root.left, num) + sumNumbers(root.right, num);
    }

}
