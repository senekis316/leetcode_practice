package practice.leecode;

import practice.utils.TreeNode;


public class PathSum_437 {

    public int pathSum(TreeNode root, int sum) {
        if (root ==  null) {
            return 0;
        }
        return paths(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int paths(TreeNode root, int sum) {
        int res = 0;
        if (root == null) {
            return res;
        }
        if (sum - root.val == 0) {
            res += 1;
        }
        return res + paths(root.left, sum - root.val) + paths(root.right, sum - root.val);
    }

}
