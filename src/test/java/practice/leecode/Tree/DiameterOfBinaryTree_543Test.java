package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class DiameterOfBinaryTree_543Test {

    @Test
    public void diameterOfBinaryTree1() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        DiameterOfBinaryTree_543 diameterOfBinaryTree = new DiameterOfBinaryTree_543();
        assertEquals(3, diameterOfBinaryTree.diameterOfBinaryTree(root));
    }

    @Test
    public void diameterOfBinaryTree2() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        root.left = node1;

        DiameterOfBinaryTree_543 diameterOfBinaryTree = new DiameterOfBinaryTree_543();
        assertEquals(1, diameterOfBinaryTree.diameterOfBinaryTree(root));
    }

}