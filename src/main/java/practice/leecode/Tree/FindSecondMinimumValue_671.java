package practice.leecode.Tree;

import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindSecondMinimumValue_671 {

    //方法一
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return findSecondMinimumValue(root, root.val);
    }

    private int findSecondMinimumValue(TreeNode root, int val) {
        if (root == null) {
            return -1;
        }
        if (root.val > val) {
            return root.val;
        }
        int l = findSecondMinimumValue(root.left, val);
        int r = findSecondMinimumValue(root.right, val);
        return l > val && r > val ? Math.min(l, r) : Math.max(l, r);
    }

    //方法二
    /*public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        List<Integer> nums = findSecondMinimumValue(root, new ArrayList<>(2));
        return nums.size() == 2 ? nums.get(1) : -1;
    }

    private List<Integer> findSecondMinimumValue(TreeNode root, List<Integer> nums) {
        if (root == null) {
            return nums;
        }
        findSecondMinimumValue(root.left, nums);
        if (nums.size() == 0) {
            nums.add(root.val);
        } else if (nums.get(0) != root.val) {
            if (nums.size() == 1) {
                nums.add(root.val);
                if (nums.get(0) > nums.get(1)) {
                    int temp = nums.get(0);
                    nums.set(0, nums.get(1));
                    nums.set(1, temp);
                }
            } else if (root.val < nums.get(1)) {
                if (root.val < nums.get(0)) {
                    nums.set(1, nums.get(0));
                    nums.set(0, root.val);
                } else {
                    nums.set(1, root.val);
                }
            }
        }
        findSecondMinimumValue(root.right, nums);
        return nums;
    }*/

}
