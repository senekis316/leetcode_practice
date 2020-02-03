package practice.leecode;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class InvertTree_226Test {

    @Test
    public void invertTree() {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(9);

        root.left = node1;
        root.right = node2;
        root.left.left = node3;
        root.left.right = node4;
        root.right.left = node5;
        root.right.right = node6;

        InvertTree_226 invertTree_226 = new InvertTree_226();
        invertTree_226.invertTree(root);

        assertEquals(4, root.val);
        assertEquals(7, root.left.val);
        assertEquals(2, root.right.val);
        assertEquals(9, root.left.left.val);
        assertEquals(6, root.left.right.val);
        assertEquals(3, root.right.left.val);
        assertEquals(1, root.right.right.val);

    }
}