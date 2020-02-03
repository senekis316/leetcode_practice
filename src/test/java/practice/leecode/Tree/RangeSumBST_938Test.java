package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class RangeSumBST_938Test {

    @Test
    public void rangeSumBST() {

        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(15);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(18);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node3.right = node5;

        assertEquals(32, new RangeSumBST_938().rangeSumBST(root, 7, 15));

    }
}