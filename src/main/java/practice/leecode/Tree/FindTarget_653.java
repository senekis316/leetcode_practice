package practice.leecode.Tree;

import practice.utils.TreeNode;

public class FindTarget_653 {

    public boolean findTarget(TreeNode root, int k) {
        return findTarget(root, root, k);
    }

    public boolean findTarget(TreeNode root, TreeNode node, int k) {
        if (node == null) {
            return false;
        }
        TreeNode findNode = findNode(root, k - node.val);
        if (findNode != null && findNode.val != node.val) {
            return true;
        } else {
            return findTarget(root, node.left, k) || findTarget(root, node.right, k);
        }
    }

    private TreeNode findNode(TreeNode node, int k) {
        if (node == null) {
            return null;
        }
        if (node.val == k) {
            return node;
        }
        if (k < node.val) {
            return findNode(node.left, k);
        } else {
            return findNode(node.right, k);
        }
    }

}
