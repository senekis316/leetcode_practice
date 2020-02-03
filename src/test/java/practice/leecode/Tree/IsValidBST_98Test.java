package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class IsValidBST_98Test {

    @Test
    public void isValidBST_1() {
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        IsValidBST_98 IsValidBST_98 = new IsValidBST_98();
        assertTrue(IsValidBST_98.isValidBST(root));
    }

    @Test
    public void isValidBST_2() {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(6);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        IsValidBST_98 IsValidBST_98 = new IsValidBST_98();
        assertFalse(IsValidBST_98.isValidBST(root));
    }

    @Test
    public void isValidBST_3() {
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(15);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(20);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        IsValidBST_98 IsValidBST_98 = new IsValidBST_98();
        assertFalse(IsValidBST_98.isValidBST(root));
    }

}