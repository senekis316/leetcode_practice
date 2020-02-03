package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class MinDiffInBST_783Test {

    @Test
    public void minDiffInBST1() {

        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        assertEquals(1, new MinDiffInBST_783().minDiffInBST(root));

    }

    @Test
    public void minDiffInBST2() {

        TreeNode root = new TreeNode(27);
        TreeNode node1 = new TreeNode(34);
        TreeNode node2 = new TreeNode(58);
        TreeNode node3 = new TreeNode(50);
        TreeNode node4 = new TreeNode(44);

        root.right = node1;
        node1.right = node2;
        node2.left = node3;
        node3.left = node4;

        assertEquals(6, new MinDiffInBST_783().minDiffInBST(root));

    }

}