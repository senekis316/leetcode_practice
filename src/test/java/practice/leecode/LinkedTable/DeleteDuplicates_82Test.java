package practice.leecode.LinkedTable;

import org.junit.Test;
import practice.utils.ListNode;
import static org.junit.Assert.*;

public class DeleteDuplicates_82Test {

    @Test
    public void deleteDuplicates_1() {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        DeleteDuplicates_82 deleteDuplicates_82 = new DeleteDuplicates_82();
        ListNode result = deleteDuplicates_82.deleteDuplicates(node1);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(5, result.next.next.val);

    }

    @Test
    public void deleteDuplicates_2() {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        DeleteDuplicates_82 deleteDuplicates_82 = new DeleteDuplicates_82();
        ListNode result = deleteDuplicates_82.deleteDuplicates(node1);

        assertEquals(2, result.val);
        assertEquals(3, result.next.val);

    }

    @Test
    public void deleteDuplicates_3() {
        DeleteDuplicates_82 deleteDuplicates_82 = new DeleteDuplicates_82();
        ListNode result = deleteDuplicates_82.deleteDuplicates(null);
        assertEquals(null, result);
    }

}