package practice.leecode.Tree;

import practice.utils.TreeNode;

public class ConvertBST_538 {

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root, 0);
        }
        return root;
    }

    public int convertBST(TreeNode root, int sum) {
        if (root == null) {
            return sum;
        }
        sum = convertBST(root.right, sum);
        int value = root.val;
        root.val += sum;
        sum += value;
        sum = convertBST(root.left, sum);
        return sum;
    }

}
