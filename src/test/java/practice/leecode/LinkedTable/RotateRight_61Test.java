package practice.leecode.LinkedTable;

import org.junit.Test;
import practice.utils.ListNode;

import static org.junit.Assert.*;

public class RotateRight_61Test {

    @Test
    public void rotateRight_1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        RotateRight_61 rotateRight_61 = new RotateRight_61();
        ListNode result = rotateRight_61.rotateRight(node1, 2);
        assertEquals(4, result.val);
        assertEquals(5, result.next.val);
        assertEquals(1, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(3, result.next.next.next.next.val);
    }

    @Test
    public void rotateRight_2() {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;

        RotateRight_61 rotateRight_61 = new RotateRight_61();
        ListNode result = rotateRight_61.rotateRight(node1, 4);
        assertEquals(2, result.val);
        assertEquals(0, result.next.val);
        assertEquals(1, result.next.next.val);
    }

    @Test
    public void rotateRight_3() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        RotateRight_61 rotateRight_61 = new RotateRight_61();
        ListNode result = rotateRight_61.rotateRight(node1, 0);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
    }

    @Test
    public void rotateRight_4() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        RotateRight_61 rotateRight_61 = new RotateRight_61();
        ListNode result = rotateRight_61.rotateRight(node1, 1);
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
    }

    @Test
    public void rotateRight_5() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        RotateRight_61 rotateRight_61 = new RotateRight_61();
        ListNode result = rotateRight_61.rotateRight(node1, 2);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
    }

}