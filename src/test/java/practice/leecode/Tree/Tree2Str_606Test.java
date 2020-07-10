package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;


import static org.junit.Assert.*;

public class Tree2Str_606Test {

    @Test
    public void tree2str1() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node1.left = node3;

        Tree2Str_606 tree2Str_606 = new Tree2Str_606();
        assertEquals("1(2(4))(3)", tree2Str_606.tree2str(root));

    }

    @Test
    public void tree2str2() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node1.right = node3;

        Tree2Str_606 tree2Str_606 = new Tree2Str_606();
        assertEquals("1(2()(4))(3)", tree2Str_606.tree2str(root));

    }


    @Test
    public void frontTree() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;

        assertArrayEquals(new int[]{1,2,4,5,3,6}, new Tree2Str_606().frontTree(root));

    }
}