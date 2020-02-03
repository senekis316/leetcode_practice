package practice.leecode.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import practice.utils.TreeNode;

public class PostOrderTraversal_145 {

    public List<Integer> postOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        LinkedList<Integer> nums = new LinkedList<>();
        if (root == null) {
            return nums;
        }
        stack.add(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            nums.addFirst(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return nums;
    }

}
