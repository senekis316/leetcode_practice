package practice.leecode;

import org.junit.Test;
import practice.leecode.RemoveLinkedElements_213.ListNode;

import static org.junit.Assert.*;

public class RemoveLinkedElements_213Test {

    @Test
    public void removeElements() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        RemoveLinkedElements_213 removeLinkedElements = new RemoveLinkedElements_213();
        ListNode first = removeLinkedElements.removeElements(node1, 6);
        assertEquals(first.val, 1);
        assertEquals(first.next.val, 2);
        assertEquals(first.next.next.val, 3);
        assertEquals(first.next.next.next.val, 4);
        assertEquals(first.next.next.next.next.val, 5);
    }
}