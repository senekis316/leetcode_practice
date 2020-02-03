package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class LowestCommonAncestor_235Test {

    @Test
    public void lowestCommonAncestor() {

        TreeNode root = new TreeNode(6);

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(8);

        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(9);

        TreeNode node7 = new TreeNode(3);
        TreeNode node8 = new TreeNode(5);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        node4.left = node7;
        node4.right = node8;

        LowestCommonAncestor_235 lowestCommonAncestor = new LowestCommonAncestor_235();
        assertEquals(6, lowestCommonAncestor.lowestCommonAncestor(root, node1, node2).val);
        assertEquals(2, lowestCommonAncestor.lowestCommonAncestor(root, node1, node4).val);

    }
}