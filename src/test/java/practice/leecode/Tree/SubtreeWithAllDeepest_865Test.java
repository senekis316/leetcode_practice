package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class SubtreeWithAllDeepest_865Test {

    @Test
    public void subtreeWithAllDeepest_1() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);

        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(8);

        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(4);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        node4.left = node7;
        node4.right = node8;

        SubtreeWithAllDeepest_865 subtreeWithAllDeepest_865 = new SubtreeWithAllDeepest_865();
        TreeNode result = subtreeWithAllDeepest_865.subtreeWithAllDeepest(root);

        assertEquals(2, result.val);
        assertEquals(7, result.left.val);
        assertEquals(4, result.right.val);
    }

    @Test
    public void subtreeWithAllDeepest_2() {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);

        TreeNode node3 = null;
        TreeNode node4 = new TreeNode(2);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        SubtreeWithAllDeepest_865 subtreeWithAllDeepest_865 = new SubtreeWithAllDeepest_865();
        TreeNode result = subtreeWithAllDeepest_865.subtreeWithAllDeepest(root);
        assertEquals(2, result.val);
        assertEquals(null, result.left);
        assertEquals(null, result.right);
    }

    @Test
    public void subtreeWithAllDeepest_3() {
        TreeNode root = new TreeNode(1);
        SubtreeWithAllDeepest_865 subtreeWithAllDeepest_865 = new SubtreeWithAllDeepest_865();
        TreeNode result = subtreeWithAllDeepest_865.subtreeWithAllDeepest(root);
        assertEquals(1, result.val);
        assertEquals(null, result.left);
        assertEquals(null, result.right);
    }

}