package practice.leecode.Tree;

import java.util.ArrayList;
import java.util.List;
import practice.utils.TreeNode;


public class FlipEquiv_951 {

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        List<Integer> nums1 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        dfs(root1, nums1);
        dfs(root2, nums2);
        return nums1.equals(nums2);
    }

    public void dfs(TreeNode root, List<Integer> nums) {
        if (root != null) {
            nums.add(root.val);
            int l = root.left != null ? root.left.val : -1;
            int r = root.right != null ? root.right.val : -1;
            if (l < r) {
                dfs(root.left, nums);
                dfs(root.right, nums);
            } else {
                dfs(root.right, nums);
                dfs(root.left, nums);
            }
        }
        nums.add(null);
    }

    /*public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == root2) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        return (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right))
            ||
            (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
    }*/


}


