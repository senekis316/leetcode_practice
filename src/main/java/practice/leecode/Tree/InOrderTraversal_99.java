package practice.leecode.Tree;

import java.util.ArrayList;
import java.util.List;

import practice.leecode.Tree.MaxDepth.TreeNode;

public class InOrderTraversal_99 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(list, root);
        return list;
    }

    private void inorderTraversal(List<Integer> list, TreeNode root) {
        if (root == null) return;
        inorderTraversal(list, root.left);
        list.add(root.val);
        inorderTraversal(list, root.right);
    }


}
