package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class LongestUnivaluePath_687Test {

    @Test
    public void longestUnivaluePath1() {

        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;

        LongestUnivaluePath_687 longestUnivaluePath_687 = new LongestUnivaluePath_687();
        assertEquals(2, longestUnivaluePath_687.longestUnivaluePath(root));

    }

    @Test
    public void longestUnivaluePath2() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;

        LongestUnivaluePath_687 longestUnivaluePath_687 = new LongestUnivaluePath_687();
        assertEquals(2, longestUnivaluePath_687.longestUnivaluePath(root));

    }

    @Test
    public void longestUnivaluePath3() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(1);

        root.right = node1;
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;

        LongestUnivaluePath_687 longestUnivaluePath_687 = new LongestUnivaluePath_687();
        assertEquals(4, longestUnivaluePath_687.longestUnivaluePath(root));

    }

    @Test
    public void longestUnivaluePath4() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(2);
        TreeNode node7 = new TreeNode(2);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node3.left = node7;

        LongestUnivaluePath_687 longestUnivaluePath_687 = new LongestUnivaluePath_687();
        assertEquals(3, longestUnivaluePath_687.longestUnivaluePath(root));

    }

    @Test
    public void longestUnivaluePath5() {

        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(3);

        TreeNode node7 = new TreeNode(5);
        TreeNode node8 = new TreeNode(1);
        TreeNode node9 = new TreeNode(5);
        TreeNode node10 = new TreeNode(1);
        TreeNode node11 = new TreeNode(4);
        TreeNode node12 = new TreeNode(5);
        TreeNode node13 = new TreeNode(6);
        TreeNode node14 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node3.left = node7;
        node3.right = node8;
        node4.left = node9;
        node4.right = node10;
        node5.left = node11;
        node5.right = node12;
        node6.left = node13;
        node6.right = node14;

        LongestUnivaluePath_687 longestUnivaluePath_687 = new LongestUnivaluePath_687();
        assertEquals(4, longestUnivaluePath_687.longestUnivaluePath(root));

    }


}