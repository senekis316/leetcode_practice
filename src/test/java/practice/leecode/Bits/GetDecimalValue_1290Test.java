package practice.leecode.Bits;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.leecode.Bits.GetDecimalValue_1290;
import practice.utils.ListNode;

public class GetDecimalValue_1290Test {

    private static GetDecimalValue_1290 getDecimalValue = new GetDecimalValue_1290();;

    @Test
    public void getDecimalValue_1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        assertEquals(5, getDecimalValue.getDecimalValue(node1));
    }

    @Test
    public void getDecimalValue_2() {
        ListNode node1 = new ListNode(0);
        assertEquals(0, getDecimalValue.getDecimalValue(node1));
    }

    @Test
    public void getDecimalValue_3() {
        ListNode node1 = new ListNode(1);
        assertEquals(1, getDecimalValue.getDecimalValue(node1));
    }

    @Test
    public void getDecimalValue_4() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(0);
        ListNode node6 = new ListNode(0);
        ListNode node7 = new ListNode(1);
        ListNode node8 = new ListNode(1);
        ListNode node9 = new ListNode(1);
        ListNode node10 = new ListNode(0);
        ListNode node11 = new ListNode(0);
        ListNode node12 = new ListNode(0);
        ListNode node13 = new ListNode(0);
        ListNode node14 = new ListNode(0);
        ListNode node15 = new ListNode(0);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;
        assertEquals(18880, getDecimalValue.getDecimalValue(node1));
    }

}