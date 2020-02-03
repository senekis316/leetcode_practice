package practice.leecode.Tree;

import practice.utils.TreeNode;

public class DistributeCoins_979 {

    private int times;

    public int distributeCoins(TreeNode root) {
        times = 0;
        dfs(root);
        return times;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = dfs(root.left);
        int r = dfs(root.right);
        times += Math.abs(l) + Math.abs(r);
        return root.val + l + r - 1;
    }


}
