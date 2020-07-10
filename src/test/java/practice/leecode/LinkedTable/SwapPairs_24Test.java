package practice.leecode.LinkedTable;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.ListNode;

public class SwapPairs_24Test {

    @Test
    public void swapPairs() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        SwapPairs_24 SwapPairs_24 = new SwapPairs_24();
        ListNode head = SwapPairs_24.swapPairs(node1);
        assertTrue(head == node2);
        assertTrue(head.next == node1);
        assertTrue(head.next.next == node4);
        assertTrue(head.next.next.next == node3);
    }
}