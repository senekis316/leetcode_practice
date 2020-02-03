package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class PruneTree_814Test {

    @Test
    public void pruneTree_1() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(1);
        root.right = node1;
        node1.left = node2;
        node1.right = node3;

        PruneTree_814 pruneTree_814 = new PruneTree_814();
        pruneTree_814.pruneTree(root);

        assertTrue(root.right.left == null);
    }

    @Test
    public void pruneTree_2() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(0);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(1);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        PruneTree_814 pruneTree_814 = new PruneTree_814();
        pruneTree_814.pruneTree(root);

        assertTrue(root.left == null);
        assertTrue(node2.left == null);

    }

    @Test
    public void pruneTree() {
    }
}