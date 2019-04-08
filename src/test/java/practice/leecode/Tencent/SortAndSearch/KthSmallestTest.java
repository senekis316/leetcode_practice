package practice.leecode.Tencent.SortAndSearch;


import practice.leecode.Tencent.SortAndSearch.KthSmallest.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthSmallestTest {

    @Test
    public void kthSmallest() {

        TreeNode root1 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(2);
        root1.left = node1;
        root1.right = node2;
        node1.right = node3;

        TreeNode root2 = new TreeNode(5);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(2);
        TreeNode node7 = new TreeNode(4);
        TreeNode node8 = new TreeNode(1);
        root2.left = node4;
        root2.right = node5;
        node4.left = node6;
        node4.right = node7;
        node6.left = node8;

        KthSmallest kthSmallest1 = new KthSmallest();
        assertEquals(1, kthSmallest1.kthSmallest(root1, 1));

        KthSmallest kthSmallest2 = new KthSmallest();
        assertEquals(3, kthSmallest2.kthSmallest(root2, 3));

    }
}