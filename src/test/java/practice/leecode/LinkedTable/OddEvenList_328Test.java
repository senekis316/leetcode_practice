package practice.leecode.LinkedTable;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.ListNode;

public class OddEvenList_328Test {

    @Test
    public void oddEvenList_1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        OddEvenList_328 OddEvenList_328 = new OddEvenList_328();
        ListNode head = OddEvenList_328.oddEvenList(node1);
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        assertEquals(node1.val, 1);
        assertEquals(node1.next.val, 3);
        assertEquals(node1.next.next.val, 5);
        assertEquals(node1.next.next.next.val, 2);
        assertEquals(node1.next.next.next.next.val, 4);
        assertEquals(node1.next.next.next.next.next, null);
    }

    @Test
    public void oddEvenList_2() {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        OddEvenList_328 OddEvenList_328 = new OddEvenList_328();
        ListNode head = OddEvenList_328.oddEvenList(node1);
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        assertEquals(node1.val, 2);
        assertEquals(node1.next.val, 3);
        assertEquals(node1.next.next.val, 6);
        assertEquals(node1.next.next.next.val, 7);
        assertEquals(node1.next.next.next.next.val, 1);
        assertEquals(node1.next.next.next.next.next.val, 5);
        assertEquals(node1.next.next.next.next.next.next.val, 4);
        assertEquals(node1.next.next.next.next.next.next.next, null);
    }
}