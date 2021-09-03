package practice.leecode.LinkedTable;

import org.junit.Test;
import practice.leecode.DeleteNode_237;
import practice.utils.ListNode;

import static org.junit.Assert.*;

public class GetKthFromEnd_22Test {

    @Test
    public void getKthFromEnd() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        GetKthFromEnd_22 getKthFromEnd_22 = new GetKthFromEnd_22();
        ListNode kth = getKthFromEnd_22.getKthFromEnd(node1, 2);

        assertEquals(4, kth.val);
        assertEquals(5, kth.next.val);
    }

}