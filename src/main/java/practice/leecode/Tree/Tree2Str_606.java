package practice.leecode.Tree;

import java.util.List;
import java.util.ArrayList;
import practice.utils.TreeNode;


public class Tree2Str_606 {

    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }
        return tree2str(root, new StringBuilder()).toString();
    }

    private StringBuilder tree2str(TreeNode root, StringBuilder result) {
        if (root == null) {
            return result;
        }
        result.append(root.val);
        if (root.left != null || (root.left == null && root.right != null)) {
            result.append("(");
            tree2str(root.left, result);
            result.append(")");
        }
        if (root.right != null) {
            result.append("(");
            tree2str(root.right, result);
            result.append(")");
        }
        return result;
    }

    //前序遍历
    public int[] frontTree(TreeNode t) {
        return frontTree(t, new ArrayList<>()).stream().mapToInt(num -> Integer.valueOf(num)).toArray();
    }

    private List<Integer> frontTree(TreeNode t, List<Integer> nums) {
        if (t == null) {
            return nums;
        }
        nums.add(t.val);
        frontTree(t.left, nums);
        frontTree(t.right, nums);
        return nums;
    }

}
