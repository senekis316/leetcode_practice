package practice.leecode.Tree;

import practice.utils.TreeNode;

public class ConstructMaximumBinaryTree_654 {


    //方法二: 迭代法
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = null;
        for (int i = 0; i < nums.length; i++) {
            TreeNode curr = new TreeNode(nums[i]);
            if (root == null || root.val < curr.val) {
                curr.left = root;
                root = curr;
            } else {
                TreeNode prev = root;
                TreeNode next = root.right;
                while(next != null) {
                    if (next.val < curr.val) {
                        curr.left = next;
                        break;
                    }
                    prev = next;
                    next = next.right;
                }
                prev.right = curr;
            }
        }
        return root;
    }

    /*
        private TreeNode root;

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null)
            return null;
        helper(nums, 0);
        return root;
    }

    private void helper(int[] nums, int pos) {
        if (pos == nums.length)
            return;

        TreeNode cur = new TreeNode(nums[pos]);

        if (root == null || root.val < cur.val) {
            cur.left = root;
            root = cur;
        } else {
            TreeNode first = root;
            TreeNode second = root.right;
            while (second != null) {
                if (second.val > cur.val) {
                    first = second;
                    second = second.right;
                } else {
                    break;
                }
            }

            first.right = cur;
            cur.left = second;
        }
        helper(nums, pos + 1);
    }
     */


    //方法一: 递归法
    /*public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return constructMaximumBinaryTree(nums, -1, null, 0, nums.length - 1);
    }

    private TreeNode constructMaximumBinaryTree(int[] nums, int index, TreeNode parent, int left, int right) {
        TreeNode node = null;
        if (left < right) {
            int middle = getMaxNumIndex(nums, left, right);
            node = createTreeNode(nums, middle, index, parent);
            constructMaximumBinaryTree(nums, middle, node, left, middle - 1);
            constructMaximumBinaryTree(nums, middle, node, middle + 1, right);
        } else if (left == right){
            node = createTreeNode(nums, left, index, parent);
        }
        return node;
    }


    private TreeNode createTreeNode(int[] nums, int middle, int index, TreeNode parent) {
        TreeNode node = new TreeNode(nums[middle]);
        if (parent != null) {
            if (index > middle) {
                parent.left = node;
            } else {
                parent.right = node;
            }
        }
        return node;
    }

    private int getMaxNumIndex(int[] nums, int left, int right) {
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }*/

}
