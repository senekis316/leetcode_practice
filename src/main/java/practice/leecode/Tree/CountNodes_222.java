package practice.leecode.Tree;

import practice.utils.TreeNode;

public class CountNodes_222 {

    //解法2:
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = countLevels(root.left);
        int right = countLevels(root.right);
        if (left == right) {
            return countNodes(root.right) + (1 << left);
        } else {
            return countNodes(root.left) + (1 << right);
        }
    }

    private int countLevels(TreeNode root) {
        int level = 0;
        while(root != null) {
            level++;
            root = root.left;
        }
        return level;
    }

    //解法1
    /*public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }*/
}
