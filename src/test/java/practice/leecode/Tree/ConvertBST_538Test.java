package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class ConvertBST_538Test {

    @Test
    public void convertBST1() {
        TreeNode root = new TreeNode(5);
        TreeNode leftNode = new TreeNode(2);
        TreeNode rightNode = new TreeNode(13);

        root.left = leftNode;
        root.right = rightNode;

        ConvertBST_538 convertBST_538 = new ConvertBST_538();
        convertBST_538.convertBST(root);

        assertEquals(18, root.val);
        assertEquals(20, root.left.val);
        assertEquals(13, root.right.val);
    }

    @Test
    public void convertBST2() {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(-4);
        TreeNode node4 = new TreeNode(1);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        ConvertBST_538 convertBST_538 = new ConvertBST_538();
        convertBST_538.convertBST(root);

        assertEquals(5, root.val);
        assertEquals(6, node1.val);
        assertEquals(3, node2.val);
        assertEquals(2, node3.val);
        assertEquals(6, node4.val);
    }
}