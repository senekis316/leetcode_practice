package practice.leecode.LinkedTable;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.ListNode;

public class Partition_86Test {

    @Test
    public void partition_1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        Partition_86 Partition_86 = new Partition_86();
        ListNode head = Partition_86.partition(node1, 3);
        //1->2->2->4->3->5
        assertEquals(head.val, 1);
        assertEquals(head.next.val, 2);
        assertEquals(head.next.next.val, 2);
        assertEquals(head.next.next.next.val, 4);
        assertEquals(head.next.next.next.next.val, 3);
        assertEquals(head.next.next.next.next.next.val, 5);
        assertEquals(head.next.next.next.next.next.next, null);
    }
}