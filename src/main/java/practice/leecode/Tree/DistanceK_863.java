package practice.leecode.Tree;

import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistanceK_863 {

    private List<Integer> ans = new ArrayList<>();
    private Map<Integer, TreeNode> parents = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        findParents(root);
        findDistances(target, null, k, 0);
        return ans;
    }

    private void findParents(TreeNode root) {
        if (root.left != null) {
            parents.put(root.left.val, root);
            findParents(root.left);
        }
        if (root.right != null) {
            parents.put(root.right.val, root);
            findParents(root.right);
        }
    }

    private void findDistances(TreeNode root, TreeNode from, int k, int d) {
        if (root == null) {
            return;
        }
        if (k == d) {
            ans.add(root.val);
        }
        if (root.left != from) {
            findDistances(root.left, root, k, d + 1);
        }
        if (root.right != from) {
            findDistances(root.right, root, k, d + 1);
        }
        if (parents.get(root.val) != from) {
            findDistances(parents.get(root.val), root, k, d + 1);
        }
    }

}
