package practice.leecode.Tree;

import java.util.List;
import java.util.ArrayList;
import practice.utils.TreeNode;


public class RightSideView_199 {

    private List<Integer> nums = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        rightSideView(root, 1);
        return nums;
    }

    private void rightSideView(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (nums.size() < level) {
            nums.add(root.val);
        }
        rightSideView(root.right, level + 1);
        rightSideView(root.left, level + 1);
    }

}
