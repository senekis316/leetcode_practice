package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class RemoveLeafNodes_1325Test {

    @Test
    public void removeLeafNodes_1() {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(2);
        TreeNode node7 = new TreeNode(4);

        root.left = node2;
        root.right = node3;

        node2.left = node4;
        node4.left = node5;

        node3.left = node6;
        node3.right = node7;

        RemoveLeafNodes_1325 RemoveLeafNodes_1325 = new RemoveLeafNodes_1325();
        RemoveLeafNodes_1325.removeLeafNodes(root, 2);

        assertEquals(1, root.val);
        assertEquals(3, root.right.val);
        assertEquals(4, root.right.right.val);
        assertEquals(null, root.left);
        assertEquals(null, node3.left);
    }

    @Test
    public void removeLeafNodes_2() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(2);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        RemoveLeafNodes_1325 RemoveLeafNodes_1325 = new RemoveLeafNodes_1325();
        RemoveLeafNodes_1325.removeLeafNodes(root, 3);

        assertEquals(1, root.val);
        assertEquals(3, root.left.val);
        assertEquals(2, root.left.right.val);

        assertEquals(null, root.right);
        assertEquals(null, root.left.left);
    }

    @Test
    public void removeLeafNodes_3() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(2);

        root.left = node1;
        node1.left = node2;
        node2.left = node3;
        node3.left = node4;

        RemoveLeafNodes_1325 RemoveLeafNodes_1325 = new RemoveLeafNodes_1325();
        RemoveLeafNodes_1325.removeLeafNodes(root, 2);

        assertEquals(1, root.val);
        assertEquals(null, root.left);
    }

    @Test
    public void removeLeafNodes_4() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);

        root.left = node1;
        root.right = node2;

        RemoveLeafNodes_1325 RemoveLeafNodes_1325 = new RemoveLeafNodes_1325();
        assertEquals(null, RemoveLeafNodes_1325.removeLeafNodes(root, 1));
    }

}