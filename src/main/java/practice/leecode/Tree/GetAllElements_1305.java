package practice.leecode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import practice.utils.TreeNode;

public class GetAllElements_1305 {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> nums1 = inOrder(root1, new LinkedList<>());
        List<Integer> nums2 = inOrder(root2, new LinkedList<>());
        return mergeOrder(nums1, nums2);
    }

    private List<Integer> inOrder(TreeNode root, LinkedList<Integer> nums) {
        if (root == null) {
            return nums;
        }
        inOrder(root.left, nums);
        nums.add(root.val);
        inOrder(root.right, nums);
        return nums;
    }

    private List<Integer> mergeOrder(List<Integer> nums1, List<Integer> nums2) {
        List<Integer> nums = new ArrayList<>();
        while(nums1.size() > 0 && nums2.size() > 0) {
            if (nums1.get(0) < nums2.get(0))  {
                nums.add(nums1.get(0));
                nums1.remove(0);
            } else if (nums1.get(0) > nums2.get(0)) {
                nums.add(nums2.get(0));
                nums2.remove(0);
            } else {
                nums.add(nums1.get(0));
                nums.add(nums2.get(0));
                nums1.remove(0);
                nums2.remove(0);
            }
        }
        if (nums1.size() > 0) {
            for(Integer num : nums1) {
                nums.add(num);
            }
        }
        if (nums2.size() > 0) {
            for(Integer num : nums2) {
                nums.add(num);
            }
        }
        return nums;
    }



}
