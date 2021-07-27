package practice.leecode.Tree;

import org.junit.Test;
import practice.leecode.DeleteNode_237;
import practice.utils.ListNode;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class SortedListToBST_109Test {

    // 给定的有序链表： [-10, -3, 0, 5, 9],
    // 一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：
    @Test
    public void sortedListToBST() {
        ListNode node1 = new ListNode(-10);
        ListNode node2 = new ListNode(-3);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        SortedListToBST_109 sortedListToBST_109 = new SortedListToBST_109();

        TreeNode root = sortedListToBST_109.sortedListToBST(node1);
        assertEquals(0, root.val);
        assertEquals(-3, root.left.val);
        assertEquals(9, root.right.val);
        assertEquals(-10, root.left.left.val);
        assertEquals(null, root.left.right);
        assertEquals(5, root.right.left.val);
    }

}