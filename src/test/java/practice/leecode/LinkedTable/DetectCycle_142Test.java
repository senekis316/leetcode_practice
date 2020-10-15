package practice.leecode.LinkedTable;

import org.junit.Test;
import practice.utils.ListNode;

import static org.junit.Assert.*;

public class DetectCycle_142Test {

    @Test
    public void detectCycle_1() {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        DetectCycle_142 detectCycle_142 = new DetectCycle_142();
        assertEquals(node1, detectCycle_142.detectCycle(head));
    }

    @Test
    public void detectCycle_2() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        node1.next = head;
        DetectCycle_142 detectCycle_142 = new DetectCycle_142();
        assertEquals(head, detectCycle_142.detectCycle(head));
    }

}