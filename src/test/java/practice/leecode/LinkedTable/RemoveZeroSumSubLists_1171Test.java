package practice.leecode.LinkedTable;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.ListNode;

public class RemoveZeroSumSubLists_1171Test {

    @Test
    public void removeZeroSumSubLists_1() {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(-3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        RemoveZeroSumSubLists_1171 RemoveZeroSumSubLists_1171 = new RemoveZeroSumSubLists_1171();
        ListNode head = RemoveZeroSumSubLists_1171.removeZeroSumSubLists(node1);

        assertEquals(3, head.val);
        assertEquals(1, head.next.val);
        assertEquals(null, head.next.next);

    }

    @Test
    public void removeZeroSumSubLists_2() {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(-3);
        ListNode node5 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        RemoveZeroSumSubLists_1171 RemoveZeroSumSubLists_1171 = new RemoveZeroSumSubLists_1171();
        ListNode head = RemoveZeroSumSubLists_1171.removeZeroSumSubLists(node1);

        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(null, head.next.next.next);

    }

    @Test
    public void removeZeroSumSubLists_3() {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(-3);
        ListNode node5 = new ListNode(-2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        RemoveZeroSumSubLists_1171 RemoveZeroSumSubLists_1171 = new RemoveZeroSumSubLists_1171();
        ListNode head = RemoveZeroSumSubLists_1171.removeZeroSumSubLists(node1);

        assertEquals(1, head.val);
        assertEquals(null, head.next);

    }


}