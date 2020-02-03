package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class SumNumbers_129Test {

    @Test
    public void sumNumbers_1() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        root.left = node1;
        root.right = node2;

        SumNumbers_129 sumNumbers_129 = new SumNumbers_129();
        assertEquals(25, sumNumbers_129.sumNumbers(root));

    }

    @Test
    public void sumNumbers_2() {

        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(1);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        SumNumbers_129 sumNumbers_129 = new SumNumbers_129();
        assertEquals(1026, sumNumbers_129.sumNumbers(root));

    }
}