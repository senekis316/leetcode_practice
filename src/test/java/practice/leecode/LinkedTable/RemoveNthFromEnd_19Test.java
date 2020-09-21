package practice.leecode.LinkedTable;

import org.junit.Test;
import practice.utils.ListNode;

import static org.junit.Assert.*;

public class RemoveNthFromEnd_19Test {

    @Test
    public void removeNthFromEnd1() {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        RemoveNthFromEnd_19 removeNthFromEnd_19 = new RemoveNthFromEnd_19();
        ListNode node = removeNthFromEnd_19.removeNthFromEnd(node1, 2);

        assertEquals(1, node.val);
        assertEquals(2, node.next.val);
        assertEquals(3, node.next.next.val);
        assertEquals(5, node.next.next.next.val);

    }

    @Test
    public void removeNthFromEnd2() {

        ListNode node1 = new ListNode(1);
        RemoveNthFromEnd_19 removeNthFromEnd_19 = new RemoveNthFromEnd_19();
        ListNode node = removeNthFromEnd_19.removeNthFromEnd(node1, 1);

        assertEquals(null, node);

    }

}