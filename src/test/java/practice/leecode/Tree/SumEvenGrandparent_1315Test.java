package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class SumEvenGrandparent_1315Test {

    @Test
    public void sumEvenGrandparent() {

        TreeNode root = new TreeNode(6);

        TreeNode node1 = new TreeNode(7);
        TreeNode node2 = new TreeNode(8);

        root.left = node1;
        root.right = node2;

        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(3);

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        TreeNode node7 = new TreeNode(9);
        TreeNode node8 = new TreeNode(1);
        TreeNode node9 = new TreeNode(4);
        TreeNode node10 = new TreeNode(5);

        node3.left = node7;
        node4.left = node8;
        node4.right = node9;
        node6.right = node10;

        SumEvenGrandparent_1315 SumEvenGrandparent_1315 = new SumEvenGrandparent_1315();
        assertEquals(18, SumEvenGrandparent_1315.sumEvenGrandparent(root));

    }
}