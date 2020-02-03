package practice.leecode.Tree;

import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum_113 {

    private int sum;

    private List<Integer> path;

    private List<List<Integer>> paths;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        this.sum = sum;
        path = new ArrayList<>();
        paths = new ArrayList<>();
        pathSum(0, root);
        return paths;
    }

    private void pathSum(int current, TreeNode root) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        if (root.left == null && root.right == null) {
            if ((current + root.val) == sum) {
                List<Integer> newPath = new ArrayList<>(path.size());
                newPath.addAll(path);
                paths.add(newPath);
            }
            path.remove(path.size() - 1);
            return;
        }
        pathSum(current + root.val, root.left);
        pathSum(current + root.val, root.right);
        path.remove(path.size() - 1);
    }

}
