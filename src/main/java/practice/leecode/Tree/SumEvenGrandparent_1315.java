package practice.leecode.Tree;

import practice.utils.TreeNode;

public class SumEvenGrandparent_1315 {

    public int sumEvenGrandparent(TreeNode root) {
        return sumEvenGrandparent(root, null, null);
    }

    private int sumEvenGrandparent(TreeNode root, TreeNode parent, TreeNode grandParent) {
        if (root == null) {
            return 0;
        }
        int nodeValue = (grandParent != null && grandParent.val % 2 == 0) ? root.val : 0;
        return nodeValue + sumEvenGrandparent(root.left, root, parent) + sumEvenGrandparent(root.right, root, parent);
    }

}
