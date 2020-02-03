package practice.leecode.Tree;

import practice.utils.TreeNode;

public class Rob_337 {

    //方法2: 存储法
    public int rob(TreeNode root) {
        return treeRob(root).val;
    }

    public TreeNode treeRob(TreeNode root) {
        if (root == null) {
            TreeNode node = new TreeNode(0);
            node.left = new TreeNode(0);
            node.right = new TreeNode(0);
            return node;
        }
        root.left = treeRob(root.left);
        root.right = treeRob(root.right);
        root.val = Math.max(root.left.val + root.right.val, root.val + root.left.left.val + root.left.right.val + root.right.left.val + root.right.right.val);
        return root;
    }

    //方法1: 暴力法
    /*public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int money = root.val;
        if (root.left != null) {
            money += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            money += rob(root.right.left) + rob(root.right.right);
        }
        return Math.max(money, rob(root.left) + rob(root.right));
    }*/

}
