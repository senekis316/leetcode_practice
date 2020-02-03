package practice.leecode.Tree;

import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class GetMinimumDifference_530 {


    private TreeNode pre = null;
    private int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        minDiff(root);
        return min;
    }

    private void minDiff(TreeNode root) {
        if (root == null) {
            return;
        }
        if (min == 0) {
            return;
        }
        minDiff(root.left);
        if (pre != null) {
            int diff = Math.abs(root.val - pre.val);
            min = min < diff ? min : diff;
        }
        pre = root;
        minDiff(root.right);
    }


    /*private int pre;
    private List<Integer> list;

    public int getMinimumDifference(TreeNode root) {
        pre = -1;
        list = new ArrayList<>();
        inOrder(root);
        return minDiff();
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        if (pre == -1) {
            list.add(root.val);
        } else if (pre != root.val) {
            list.add(root.val);
        }
        inOrder(root.right);
    }

    public int minDiff() {
        int min = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            int diff = Math.abs(list.get(i) - list.get(i + 1));
            if (min == -1) {
                min = diff;
            } else {
                min = min < diff ? min : diff;
            }
            if (min == 0) {
                break;
            }
        }
        return min;
    }*/

}
