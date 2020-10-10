package practice.alibaba;

import org.junit.Test;
import practice.utils.ListNode;

import static org.junit.Assert.*;

public class HasCycle_141Test {

    @Test
    public void hasCycle_1() {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        HasCycle_141 hasCycle_141 = new HasCycle_141();
        assertTrue(hasCycle_141.hasCycle(head));
    }

    @Test
    public void hasCycle_2() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);

        head.next = node1;
        node1.next = head;

        HasCycle_141 hasCycle_141 = new HasCycle_141();
        assertTrue(hasCycle_141.hasCycle(head));
    }

    @Test
    public void hasCycle_3() {
        ListNode head = new ListNode(1);
        HasCycle_141 hasCycle_141 = new HasCycle_141();
        assertFalse(hasCycle_141.hasCycle(head));
    }

}