package practice.leecode.Tree;

import practice.utils.TreeNode;

public class IsValidBST_98 {

    //方法三: 中序遍历法
    private Integer pre;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (pre != null && root.val <= pre) {
            return false;
        }
        pre = root.val;
        if (!isValidBST(root.right)) {
            return false;
        }
        return true;
    }

    //方法二: 迭代法
    /*private LinkedList<TreeNode> nodes;
    private LinkedList<Integer> lowers;
    private LinkedList<Integer> uppers;

    public boolean isValidBST(TreeNode root) {
        nodes = new LinkedList();
        lowers = new LinkedList();
        uppers = new LinkedList();
        inList(root, null, null);
        while (nodes.size() != 0) {
            TreeNode node = nodes.pollFirst();
            Integer lower = lowers.pollFirst();
            Integer upper = uppers.pollFirst();
            if (lower != null && node.val <= lower) {
                return false;
            }
            if (upper != null && node.val >= upper) {
                return false;
            }
            if (node.left != null) {
                inList(node.left, lower, node.val);
            }
            if (node.right != null) {
                inList(node.right, node.val, upper);
            }
        }
        return true;
    }

    public void inList(TreeNode root, Integer lower, Integer upper) {
        nodes.add(root);
        lowers.add(lower);
        uppers.add(upper);
    }*/

    /* 方法一: 递归
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer lower, Integer upper) {
        if (root == null) {
            return true;
        }
        if (lower != null && root.val <= lower) {
            return false;
        }
        if (upper != null && root.val >= upper) {
            return false;
        }
        if (!isValidBST(root.left, lower, root.val)) {
            return false;
        }
        if (!isValidBST(root.right, root.val, upper)) {
            return false;
        }
        return true;
    }*/

}
