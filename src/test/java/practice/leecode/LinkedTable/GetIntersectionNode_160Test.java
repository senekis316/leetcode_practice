package practice.leecode.LinkedTable;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.ListNode;

public class GetIntersectionNode_160Test {

    @Test
    public void getIntersectionNode_1() {
        ListNode a1= new ListNode(4);
        ListNode a2= new ListNode(1);

        ListNode b1= new ListNode(5);
        ListNode b2= new ListNode(0);
        ListNode b3= new ListNode(1);

        ListNode c1= new ListNode(8);
        ListNode c2= new ListNode(4);
        ListNode c3= new ListNode(5);

        a1.next = a2;
        a2.next = c1;

        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        c1.next = c2;
        c2.next = c3;

        GetIntersectionNode_160 GetIntersectionNode_160 = new GetIntersectionNode_160();
        assertTrue(c1 == GetIntersectionNode_160.getIntersectionNode(a1, b1));
    }

    @Test
    public void getIntersectionNode_2() {
        ListNode a1= new ListNode(0);
        ListNode a2= new ListNode(9);
        ListNode a3= new ListNode(1);

        ListNode b1= new ListNode(3);

        ListNode c1= new ListNode(2);
        ListNode c2= new ListNode(4);

        a1.next = a2;
        a2.next = a3;
        a3.next = c1;

        b1.next = c1;

        c1.next = c2;

        GetIntersectionNode_160 GetIntersectionNode_160 = new GetIntersectionNode_160();
        assertTrue(c1 == GetIntersectionNode_160.getIntersectionNode(a1, b1));
    }

    @Test
    public void getIntersectionNode_3() {
        ListNode a1= new ListNode(2);
        ListNode a2= new ListNode(6);
        ListNode a3= new ListNode(4);

        ListNode b1= new ListNode(1);
        ListNode b2= new ListNode(5);

        a1.next = a2;
        a2.next = a3;

        b1.next = b2;

        GetIntersectionNode_160 GetIntersectionNode_160 = new GetIntersectionNode_160();
        assertTrue(null == GetIntersectionNode_160.getIntersectionNode(a1, b1));
    }

}