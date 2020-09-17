package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class CountPairs_1530Test {

    @Test
    public void countPairs_1() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        root.left = node1;
        root.right = node2;
        node1.right = node3;
        CountPairs_1530 countPairs_1530 = new CountPairs_1530();
        assertEquals(1, countPairs_1530.countPairs(root, 3));
    }

    @Test
    public void countPairs_2() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        CountPairs_1530 countPairs_1530 = new CountPairs_1530();
        assertEquals(2, countPairs_1530.countPairs(root, 3));
    }

    @Test
    public void countPairs_4() {
        TreeNode root = new TreeNode(100);
        CountPairs_1530 countPairs_1530 = new CountPairs_1530();
        assertEquals(0, countPairs_1530.countPairs(root, 1));
    }

    @Test
    public void countPairs_5() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        CountPairs_1530 countPairs_1530 = new CountPairs_1530();
        assertEquals(1, countPairs_1530.countPairs(root, 2));
    }

}