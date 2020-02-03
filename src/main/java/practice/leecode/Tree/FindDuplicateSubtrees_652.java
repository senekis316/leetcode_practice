package practice.leecode.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import practice.utils.TreeNode;


public class FindDuplicateSubtrees_652 {

    private List<TreeNode> nodes;
    private Map<String, Integer> trees;

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        trees = new HashMap<>();
        nodes = new ArrayList<>();
        dfs(root);
        return nodes;
    }

    private String dfs(TreeNode root) {
        if (root == null) return "#";
        String tree = root.val + "," + dfs(root.left) + "," + dfs(root.right);
        trees.put(tree, trees.getOrDefault(tree, 0) + 1);
        if (trees.get(tree) == 2) {
            nodes.add(root);
        }
        return tree;
    }

}
