package practice.leecode.Tree;

import practice.utils.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder_589 {

    // 方式一: 迭代
    public List<Integer> preOrder(Node root) {
        List<Integer> nums = new ArrayList<>();
        if (root == null) {
            return nums;
        }
        Stack<Node> nodes = new Stack<>();
        nodes.push(root);
        while(!nodes.isEmpty()) {
            Node currNode = nodes.pop();
            nums.add(currNode.val);
            if (currNode.children != null) {
                for (int i = currNode.children.size() - 1; i > 0; i--) {
                    nodes.push(currNode.children.get(i));
                }
            }
        }
        return nums;
    }

    // 方式二: 递归
    /*public List<Integer> preOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        return preOrder(root, new ArrayList<>());
    }

    private List<Integer> preOrder(Node root, List<Integer> nums) {
        if (root == null) {
            return nums;
        }
        nums.add(root.val);
        if (root.children != null) {
            for (int i = 0; i < root.children.size(); i++) {
                preOrder(root.children.get(i), nums);
            }
        }
        return nums;
    }*/

}
