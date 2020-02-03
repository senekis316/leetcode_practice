package practice.leecode.Tree;

import java.util.LinkedList;
import java.util.Queue;
import practice.utils.TreeNode;

public class IsCompleteTree {

    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList();
        nodes.add(root);
        TreeNode node;
        while((node = nodes.poll()) != null) {
            nodes.add(node.left);
            nodes.add(node.right);
        }
        while(!nodes.isEmpty()) {
            if (nodes.poll() != null) {
                return false;
            }
        }
        return true;
    }

    /*public boolean isCompleteTree(TreeNode root) {
        LinkedList<TreeNode> nodes = new LinkedList();
        nodes.add(root);
        List<Integer> nums = new ArrayList<>();
        boolean hasNull = false;
        while(nodes.size() > 0) {
            TreeNode node = nodes.pollFirst();
            if (node != null) {
                if (hasNull == true) {
                    return false;
                }
                nums.add(node.val);
                nodes.add(node.left);
                nodes.add(node.right);
            } else {
                hasNull = true;
                nums.add(null);
            }
        }
        return true;
    }*/

}
