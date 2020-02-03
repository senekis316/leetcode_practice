package practice.leecode.Tree;

import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder_102 {

    private List<List<Integer>> levels;

    public List<List<Integer>> levelOrder(TreeNode root) {
        levels = new ArrayList<>();
        levelOrder(root, 0);
        return levels;
    }

    private void levelOrder(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (levels.size() == level) {
            levels.add(new ArrayList<>());
        }
        List<Integer> nodes = levels.get(level);
        nodes.add(root.val);
        levelOrder(root.left, level + 1);
        levelOrder(root.right, level + 1);
    }

}
