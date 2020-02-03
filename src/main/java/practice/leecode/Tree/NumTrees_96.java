package practice.leecode.Tree;


import practice.utils.TreeNode;

import java.util.LinkedList;

public class NumTrees_96 {

    public int numTrees(int n) {
        if (n < 1) {
            return 0;
        }
        return generateTrees(1, 3).size();
    }

    private LinkedList<TreeNode> generateTrees(int start, int end) {
        LinkedList<TreeNode> allTrees = new LinkedList<>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }
        for (int i = start; i <= end; i++) {
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

    /*public int numTrees(int n) {
        if (n <= 0) {
            return 0;
        }
        return numTrees(1, n).size();
    }

    private LinkedList<TreeNode> numTrees(int start, int end) {
        LinkedList<TreeNode> allTrees = new LinkedList<>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }
        for (int i = start; i <= end; i++) {
            LinkedList<TreeNode> leftTrees = numTrees(start, i - 1);
            LinkedList<TreeNode> rightTrees = numTrees(i + 1, end);
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
    }*/

}
