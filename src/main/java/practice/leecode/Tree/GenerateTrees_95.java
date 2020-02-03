package practice.leecode.Tree;

import practice.utils.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class GenerateTrees_95 {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<>();
        }
        return generateTrees(1, n);
    }

    private LinkedList<TreeNode> generateTrees(int start, int end) {
        LinkedList<TreeNode> allTrees = new LinkedList<>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }
        for(int i = start; i <= end; i++) {
            LinkedList<TreeNode> leftTrees = generateTrees(start, i - 1);
            LinkedList<TreeNode> rightTrees = generateTrees(i + 1, end);
            for (TreeNode leftTree : leftTrees) {
                for (TreeNode rightTree : rightTrees) {
                    TreeNode rootTree = new TreeNode(i);
                    rootTree.left = leftTree;
                    rootTree.right = rightTree;
                    allTrees.add(rootTree);
                }
            }
        }
        return allTrees;
    }

}
