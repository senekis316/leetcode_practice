package practice.leecode.LinkedTable;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import practice.utils.ListNode;

public class AddTwoNumbers_445Test {

    @Test
    public void addTwoNumbers_1() {
        ListNode l1 = new ListNode(7);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ListNode q1 = new ListNode(5);
        ListNode q2 = new ListNode(6);
        ListNode q3 = new ListNode(4);
        q1.next = q2;
        q2.next = q3;

        AddTwoNumbers_445 AddTwoNumbers_445 = new AddTwoNumbers_445();
        ListNode head = AddTwoNumbers_445.addTwoNumbers(l1, q1);

        assertEquals(7, head.val);
        assertEquals(8, head.next.val);
        assertEquals(0, head.next.next.val);
        assertEquals(7, head.next.next.next.val);
    }

    //[3,9,9,9,9,9,9,9,9,9]
    //[7]
    @Test
    public void addTwoNumbers_2() {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(9);
        ListNode l8 = new ListNode(9);
        ListNode l9 = new ListNode(9);
        ListNode l10 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = l9;
        l9.next = l10;

        ListNode q1 = new ListNode(7);

        AddTwoNumbers_445 AddTwoNumbers_445 = new AddTwoNumbers_445();
        ListNode head = AddTwoNumbers_445.addTwoNumbers(l1, q1);

        assertEquals(4, head.val);
        head = head.next;
        while(head != null && head.next != null) {
            assertEquals(0, head.val);
            head = head.next;
        }
        assertEquals(6, head.val);
    }

    @Test
    public void addTwoNumbers_3() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        AddTwoNumbers_445 AddTwoNumbers_445 = new AddTwoNumbers_445();
        AddTwoNumbers_445.addTwoNumbers(l1, l2);
        ListNode head = AddTwoNumbers_445.addTwoNumbers(l1, l2);
        assertEquals(1, head.val);
        assertEquals(0, head.next.val);

    }

}