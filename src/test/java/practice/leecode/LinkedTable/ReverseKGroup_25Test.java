package practice.leecode.LinkedTable;

import org.junit.Test;
import practice.leecode.DeleteNode_237;
import practice.utils.ListNode;

import static org.junit.Assert.*;

public class ReverseKGroup_25Test {

    @Test
    public void reverseKGroup_1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ReverseKGroup_25 reverseKGroup_25 = new ReverseKGroup_25();
        ListNode head = reverseKGroup_25.reverseKGroup(node1, 2);
        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(3, head.next.next.next.val);
        assertEquals(5, head.next.next.next.next.val);
    }

    @Test
    public void reverseKGroup_2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ReverseKGroup_25 reverseKGroup_25 = new ReverseKGroup_25();
        ListNode head = reverseKGroup_25.reverseKGroup(node1, 3);
        assertEquals(3, head.val);
        assertEquals(2, head.next.val);
        assertEquals(1, head.next.next.val);
        assertEquals(4, head.next.next.next.val);
        assertEquals(5, head.next.next.next.next.val);
    }

    @Test
    public void reverseKGroup_3() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ReverseKGroup_25 reverseKGroup_25 = new ReverseKGroup_25();
        ListNode head = reverseKGroup_25.reverseKGroup(node1, 1);
        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(4, head.next.next.next.val);
        assertEquals(5, head.next.next.next.next.val);
    }

    @Test
    public void reverseKGroup_4() {
        ListNode node1 = new ListNode(1);

        ReverseKGroup_25 reverseKGroup_25 = new ReverseKGroup_25();
        ListNode head = reverseKGroup_25.reverseKGroup(node1, 1);
        assertEquals(1, head.val);
    }

    @Test
    public void reverseKGroup_5() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        node1.next = node2;

        ReverseKGroup_25 reverseKGroup_25 = new ReverseKGroup_25();
        ListNode head = reverseKGroup_25.reverseKGroup(node1, 2);
        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
    }

    @Test
    public void reverseKGroup_6() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ReverseKGroup_25 reverseKGroup_25 = new ReverseKGroup_25();
        ListNode head = reverseKGroup_25.reverseKGroup(node1, 2);
        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(3, head.next.next.next.val);
    }

}