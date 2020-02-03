package practice.leecode.Tree;

import practice.utils.TreeNode;

public class FindBottomLeftValue_513 {

    int max;
    int left;

    public int findBottomLeftValue(TreeNode root) {
        max = 0;
        left = 0;
        findBottomLeftValue(root, 1);
        return left;
    }

    private void findBottomLeftValue(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level > max) {
            max = level;
            left = root.val;
        }
        findBottomLeftValue(root.left, level + 1);
        findBottomLeftValue(root.right, level + 1);
    }

}
