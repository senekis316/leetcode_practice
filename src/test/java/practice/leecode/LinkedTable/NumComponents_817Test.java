package practice.leecode.LinkedTable;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.ListNode;

public class NumComponents_817Test {

    @Test
    public void numComponents_1() {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        int[] G = new int[]{0, 1, 3};
        NumComponents_817 NumComponents_817 = new NumComponents_817();
        assertEquals(2, NumComponents_817.numComponents(node1, G));
    }

    @Test
    public void numComponents_2() {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        int[] G = new int[]{0, 3, 1, 4};
        NumComponents_817 NumComponents_817 = new NumComponents_817();
        assertEquals(2, NumComponents_817.numComponents(node1, G));
    }

    @Test
    public void numComponents_3() {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        int[] G = new int[]{0, 2};
        NumComponents_817 NumComponents_817 = new NumComponents_817();
        assertEquals(2, NumComponents_817.numComponents(node1, G));
    }

}