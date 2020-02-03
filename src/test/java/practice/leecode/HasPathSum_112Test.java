package practice.leecode;

import org.junit.Test;
import practice.leecode.Common.TreeNode;

import static org.junit.Assert.*;

public class HasPathSum_112Test {

    @Test
    public void hasPathSum1() {

        TreeNode root = new TreeNode(5);

        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(8);

        TreeNode node3 = new TreeNode(11);
        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(4);

        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(2);
        TreeNode node8 = new TreeNode(1);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;
        node5.right = node8;

        HasPathSum_112 hasPathSum_112 = new HasPathSum_112();
        assertEquals(true, hasPathSum_112.hasPathSum(root, 22));

    }

    @Test
    public void hasPathSum2() {

        TreeNode root = new TreeNode(1);

        TreeNode node1 = new TreeNode(2);

        root.left = node1;

        HasPathSum_112 hasPathSum_112 = new HasPathSum_112();
        assertEquals(false, hasPathSum_112.hasPathSum(root, 1));

    }

}