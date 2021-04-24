package practice.leecode;

import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class IncreasingBST_897 {

    private TreeNode head;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode prev = new TreeNode(-1);
        head = prev;
        middleOrder(root);
        return prev.right;
    }

    private void middleOrder(TreeNode root) {
        if (root == null) return;
        middleOrder(root.left);
        root.left = null;
        head.right = root;
        head = head.right;
        middleOrder(root.right);
    }

//    TreeNode first;
//
//    public TreeNode increasingBST(TreeNode root) {
//        TreeNode head = new TreeNode(0);
//        first = head;
//        middleOrder(root);
//        return head.right;
//    }
//
//    private void middleOrder(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        middleOrder(root.left);
//        first.right = new TreeNode(root.val);
//        first = first.right;
//        middleOrder(root.right);
//        return;
//    }

}
