package practice.leecode.Tree;

import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AverageOfLevels_637 {

    public List<Double> averageOfLevels(TreeNode root) {
        List<List<TreeNode>> nodesOfLevels = nodesOfLevels(root, 0, new ArrayList<>());
        return averageOfLevels(nodesOfLevels);
    }

    private List<List<TreeNode>> nodesOfLevels(TreeNode root, int level, List<List<TreeNode>> nodesOfLevels) {
        if (root == null) {
            return nodesOfLevels;
        }
        if (nodesOfLevels.size() == level) {
            nodesOfLevels.add(new ArrayList<>());
        }
        nodesOfLevels.get(level).add(root);
        nodesOfLevels(root.left, level + 1, nodesOfLevels);
        nodesOfLevels(root.right, level + 1, nodesOfLevels);
        return nodesOfLevels;
    }

    private List<Double> averageOfLevels(List<List<TreeNode>> nodesOfLevels) {
        List<Double> averageOfLevels = new ArrayList<>();
        for (List<TreeNode> nodes: nodesOfLevels) {
            double sum = 0;
            for (TreeNode treeNode: nodes) {
                sum += treeNode.val;
            }
            averageOfLevels.add(sum / nodes.size());
        }
        return averageOfLevels;
    }

}
