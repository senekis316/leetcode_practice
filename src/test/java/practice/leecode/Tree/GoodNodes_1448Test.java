package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class GoodNodes_1448Test {

    @Test
    public void goodNodes_1() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node2.left = node4;
        node2.right = node5;

        GoodNodes_1448 goodNodes_1448 = new GoodNodes_1448();
        assertEquals(4, goodNodes_1448.goodNodes(root));
    }

    @Test
    public void goodNodes_2() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(2);

        root.left = node1;
        node1.left = node2;
        node1.right = node3;

        GoodNodes_1448 goodNodes_1448 = new GoodNodes_1448();
        assertEquals(3, goodNodes_1448.goodNodes(root));
    }

    @Test
    public void goodNodes_3() {
        TreeNode root = new TreeNode(1);
        GoodNodes_1448 goodNodes_1448 = new GoodNodes_1448();
        assertEquals(1, goodNodes_1448.goodNodes(root));
    }

}