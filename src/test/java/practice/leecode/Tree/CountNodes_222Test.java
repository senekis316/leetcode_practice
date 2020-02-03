package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class CountNodes_222Test {

    @Test
    public void countNodes() {
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

        CountNodes_222 countNodes_222 = new CountNodes_222();
        assertEquals(6, countNodes_222.countNodes(root));

    }

}