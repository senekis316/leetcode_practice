package practice.leecode.Tree;

import java.util.ArrayList;
import java.util.List;
import practice.utils.TreeNode;

public class BSTIterator_173 {

    private int index;
    private List<Integer> nums;

    public BSTIterator_173(TreeNode root) {
        this.index = 0;
        this.nums = new ArrayList<>();
        inOrder(root);
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        nums.add(root.val);
        inOrder(root.right);
    }

    public int next() {
        return nums.get(index++);
    }

    public boolean hasNext() {
        return index < nums.size() ? true : false;
    }

}
