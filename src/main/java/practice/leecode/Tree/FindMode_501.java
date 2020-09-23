package practice.leecode.Tree;

import practice.utils.TreeNode;

import java.util.*;

public class FindMode_501 {

    int pre;
    int cur;
    int max;
    List<Integer> nums;

    public int[] findMode(TreeNode root) {
        pre = -1;
        cur = 0;
        max = 0;
        nums = new ArrayList<>();
        inOrder(root);
        int[] res = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            res[i] = nums.get(i);
        }
        return res;
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        cur = pre == root.val ? cur + 1 : 1;
        if (cur > max) {
            max = cur;
            nums.clear();
        }
        if (cur == max) {
            nums.add(root.val);
        }
        pre = root.val;
        inOrder(root.right);
    }

}
