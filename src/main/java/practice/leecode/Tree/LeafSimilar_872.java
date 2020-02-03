package practice.leecode.Tree;

import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilar_872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> nums1 = leafSimilar(root1, new ArrayList<>());
        List<Integer> nums2 = leafSimilar(root2, new ArrayList<>());
        return isEqualList(nums1, nums2);
    }

    private List<Integer> leafSimilar(TreeNode root, List<Integer> nums) {
        if (root == null) {
            return nums;
        }
        if (root.left == null && root.right == null) {
            nums.add(root.val);
            return nums;
        }
        leafSimilar(root.left, nums);
        leafSimilar(root.right, nums);
        return nums;
    }

    private boolean isEqualList(List<Integer> nums1, List<Integer> nums2) {
        if (nums1.size() != nums2.size()) {
            return false;
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) != nums2.get(i)) {
                return false;
            }
        }
        return true;
    }

}
