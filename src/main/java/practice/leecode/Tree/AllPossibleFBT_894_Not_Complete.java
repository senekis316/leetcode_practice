package practice.leecode.Tree;

import java.util.ArrayList;
import java.util.List;
import practice.utils.TreeNode;

public class AllPossibleFBT_894_Not_Complete{

    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> res = new ArrayList<>();
        if (N == 1) {
            List<TreeNode> nodes = new ArrayList<>();
            nodes.add(new TreeNode(0));
            return nodes;
        }
        if (N % 2 == 0) {
            return new ArrayList<>(0);
        }
        int leftNum = 1;
        int rightNum = N - 2;
        while (rightNum > 0) {
            List<TreeNode> leftNodes = allPossibleFBT(leftNum);
            List<TreeNode> rightNodes = allPossibleFBT(rightNum);
            for (TreeNode leftNode : leftNodes) {
                for (TreeNode rightNode : rightNodes) {
                    TreeNode root = new TreeNode(0);
                    root.left = leftNode;
                    root.right = rightNode;
                    res.add(root);
                }
            }
            leftNum += 2;
            rightNum -= 2;
        }
        return res;
    }


}
