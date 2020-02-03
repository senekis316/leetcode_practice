package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class BstToGst_1038Test {

    @Test
    public void bstToGst() {

        TreeNode root = new TreeNode(4);

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(6);

        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(7);

        TreeNode node7 = new TreeNode(3);
        TreeNode node8 = new TreeNode(8);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        node4.right = node7;

        node6.right = node8;

        BstToGst_1038 bstToGst_1038 = new BstToGst_1038();
        bstToGst_1038.bstToGst(root);

        assertEquals(30, root.val);
        assertEquals(36, node1.val);
        assertEquals(21, node2.val);
        assertEquals(36, node3.val);
        assertEquals(35, node4.val);
        assertEquals(26, node5.val);
        assertEquals(15, node6.val);
        assertEquals(33, node7.val);
        assertEquals(8, node8.val);

    }

}