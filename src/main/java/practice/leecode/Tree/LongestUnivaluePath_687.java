package practice.leecode.Tree;

import practice.utils.TreeNode;

public class LongestUnivaluePath_687 {

    private int longest;

    public int longestUnivaluePath(TreeNode root) {
        longest = 0;
        longestUnivaluePath2(root);
        return longest;
    }

    public int longestUnivaluePath2(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int l = longestUnivaluePath2(root.left);
        int r = longestUnivaluePath2(root.right);

        l = root.left != null && root.val == root.left.val ? l + 1 : 0;
        r = root.right != null && root.val == root.right.val ? r + 1 : 0;

        longest = Math.max(longest, l + r);

        return Math.max(l, r);

    }

}
