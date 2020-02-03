package practice.leecode.Tree;

import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class IsCousins_993 {


    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }
        List<DepthTreeNode> depthTreeNodeList = isCousins(root, root, 0, x, y, new ArrayList<>());
        if (depthTreeNodeList.size() == 2) {
            DepthTreeNode node1 = depthTreeNodeList.get(0);
            DepthTreeNode node2 = depthTreeNodeList.get(1);
            return node1.depth == node2.depth && node1.parent != node2.parent;
        }
        return false;
    }

    private List<DepthTreeNode> isCousins(TreeNode root, TreeNode parent, int depth, int x, int y, List<DepthTreeNode> depthTreeNodeList) {
        if (root == null || depthTreeNodeList.size() == 2) {
            return depthTreeNodeList;
        }
        if (root.val == x || root.val == y) {
            depthTreeNodeList.add(new DepthTreeNode(depth, parent));
        }
        isCousins(root.left, root, depth + 1, x, y, depthTreeNodeList);
        isCousins(root.right, root, depth + 1, x, y, depthTreeNodeList);
        return depthTreeNodeList;

    }

    private static class DepthTreeNode {

        private int depth;

        private TreeNode parent;

        public DepthTreeNode(int depth, TreeNode parent) {
            this.depth = depth;
            this.parent = parent;
        }

        public int getDepth() {
            return depth;
        }

        public TreeNode getParent() {
            return parent;
        }

    }


}
