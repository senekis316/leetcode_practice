package practice.leecode.Tree;

import practice.utils.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class PostOrder_590 {

    public List<Integer> postOrder(Node root) {
        List<Integer> nums = new ArrayList<>();
        if (root == null) {
            return nums;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node curr = stack.pop();
            nums.add(0, curr.val);
            if (curr.children != null) {
                for (int i = 0; i < curr.children.size(); i++) {
                    stack.push(curr.children.get(i));
                }
            }
        }
        return nums;
    }

}
