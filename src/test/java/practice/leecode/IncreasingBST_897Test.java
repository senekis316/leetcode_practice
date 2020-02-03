package practice.leecode;

import org.junit.Test;
import practice.utils.TreeNode;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class IncreasingBST_897Test {

    @Test
    public void increasingBST1() {

        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);

        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(8);

        TreeNode node6 = new TreeNode(1);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(9);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;
        node2.right = node5;

        node3.left = node6;
        node5.left = node7;
        node5.right = node8;

        TreeNode result = new IncreasingBST_897().increasingBST(root);

        assertEquals(1, result.val);
        assertEquals(2, result.right.val);
        assertEquals(3, result.right.right.val);
        assertEquals(4, result.right.right.right.val);
        assertEquals(5, result.right.right.right.right.val);
        assertEquals(6, result.right.right.right.right.right.val);
        assertEquals(7, result.right.right.right.right.right.right.val);
        assertEquals(8, result.right.right.right.right.right.right.right.val);
        assertEquals(9, result.right.right.right.right.right.right.right.right.val);

    }

    @Test
    public void increasingBST2() {

        TreeNode root = new TreeNode(379);
        TreeNode node1 = new TreeNode(826);

        root.right = node1;

        TreeNode result = new IncreasingBST_897().increasingBST(root);

        assertEquals(379, result.val);
        assertEquals(826, result.right.val);

    }

}