package practice.leecode.Tree;

import java.util.ArrayList;
import java.util.List;
import practice.utils.TreeNode;

public class ZigzagLevelOrder_103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<TreeNode> levelNodes = new ArrayList<>();
        levelNodes.add(root);
        return zigzagLevelOrder(true, levelNodes, new ArrayList<>());
    }

    private List<List<Integer>> zigzagLevelOrder(boolean zigzag, List<TreeNode> levelNodes, List<List<Integer>> zigzagLevelOrders) {
        if (levelNodes == null || levelNodes.size() == 0) {
            return zigzagLevelOrders;
        }
        List<Integer> zigzagLevelOrder = new ArrayList<>();
        if (zigzag) {
            for (int i = 0; i < levelNodes.size(); i++) {
                zigzagLevelOrder.add(levelNodes.get(i).val);
            }
        } else {
            for (int i = levelNodes.size() - 1; i >= 0; i--) {
                zigzagLevelOrder.add(levelNodes.get(i).val);
            }
        }
        zigzagLevelOrders.add(zigzagLevelOrder);
        List<TreeNode> nextLevelNodes = new ArrayList<>();
        for (int i = 0; i < levelNodes.size(); i++) {
            TreeNode levelNode = levelNodes.get(i);
            if (levelNode != null) {
                if (levelNode.left != null) {
                    nextLevelNodes.add(levelNode.left);
                }
                if (levelNode.right != null) {
                    nextLevelNodes.add(levelNode.right);
                }
            }
        }
        zigzagLevelOrder(!zigzag, nextLevelNodes, zigzagLevelOrders);
        return zigzagLevelOrders;
    }

}
