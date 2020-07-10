package practice.leecode.LinkedTable;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.ListNode;

public class DeleteDuplicates_83Test {

    @Test
    public void deleteDuplicates_1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        DeleteDuplicates_83 DeleteDuplicates_83 = new DeleteDuplicates_83();
        DeleteDuplicates_83.deleteDuplicates(node1);
        assertTrue(node1.val == 1);
        assertTrue(node1.next.val == 2);
    }

    @Test
    public void deleteDuplicates_2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        DeleteDuplicates_83 DeleteDuplicates_83 = new DeleteDuplicates_83();
        DeleteDuplicates_83.deleteDuplicates(node1);
        assertTrue(node1.val == 1);
        assertTrue(node1.next.val == 2);
        assertTrue(node3.next.val == 3);
        assertTrue(node4.next == null);
    }

    @Test
    public void deleteDuplicates_3() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        DeleteDuplicates_83 DeleteDuplicates_83 = new DeleteDuplicates_83();
        DeleteDuplicates_83.deleteDuplicates(node1);
        assertTrue(node1.val == 1);
        assertTrue(node1.next == null);
    }
}