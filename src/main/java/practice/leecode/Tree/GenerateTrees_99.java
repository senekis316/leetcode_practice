package practice.leecode.Tree;

import java.util.LinkedList;
import java.util.List;

public class GenerateTrees_99 {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new LinkedList<>();
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> res = new LinkedList<>();
        if (start > end) {
            res.add(null);
            return res;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> subLeftFree = generateTrees(start, i - 1);
            List<TreeNode> subRightFree = generateTrees(i + 1, end);
            for (TreeNode left : subLeftFree) {
                for (TreeNode right : subRightFree) {
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    res.add(node);
                }
            }
        }
        return res;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static class SortedArrayToBST_108 {

        //TODO
        public TreeNode sortedArrayToBST(int[] nums) {
            int middle = nums.length / 2;
            TreeNode treeNode = new TreeNode(nums[middle]);
            treeNode.left = sortedArrayToBST(nums);
            treeNode.right = sortedArrayToBST(nums);
            return treeNode;
        }

    }
}
