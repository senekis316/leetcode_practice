package practice.leecode.LinkedTable;

import org.junit.Test;
import practice.utils.ListNode;

import static org.junit.Assert.*;

public class ReverseBetween_92Test {

    @Test
    public void reverseBetween_1() {

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ReverseBetween_92 reverseBetween_92 = new ReverseBetween_92();
        ListNode result = reverseBetween_92.reverseBetween(head, 2, 4);

        //1->4->3->2->5->null
        assertEquals(1, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
        assertEquals(null, result.next.next.next.next.next);

    }

    @Test
    public void reverseBetween_2() {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(5);

        head.next = node1;

        ReverseBetween_92 reverseBetween_92 = new ReverseBetween_92();
        ListNode result = reverseBetween_92.reverseBetween(head, 1, 2);

        //5->3->null
        assertEquals(5, result.val);
        assertEquals(3, result.next.val);
        assertEquals(null, result.next.next);

    }

}