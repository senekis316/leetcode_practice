package practice.leecode.Tree;


import practice.utils.TreeNode;

public class FindTilt {

    private int tilt = 0;

    public int findTile(TreeNode root) {
        sumTile(root);
        return tilt;
    }

    private int sumTile(TreeNode root) {
        if (root == null) return 0;
        int left = sumTile(root.left);
        int right = sumTile(root.right);
        tilt += Math.abs(left - right);
        return root.val + left + right;
    }

}
