package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class IsCousins_993Test {

    @Test
    public void isCousins1() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node1.left = node3;

        assertEquals(false, new IsCousins_993().isCousins(root, 4, 3));

    }

    @Test
    public void isCousins2() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node1.right = node3;
        node2.right = node4;

        assertEquals(true, new IsCousins_993().isCousins(root, 5, 4));

    }

    @Test
    public void isCousins3() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node1.right = node3;

        assertEquals(false, new IsCousins_993().isCousins(root, 2, 3));

    }

}