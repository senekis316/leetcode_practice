package practice.leecode.LinkedTable;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.ListNode;

public class InsertionSortList_147Test {

    @Test
    public void insertionSortList_1() {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        InsertionSortList_147 InsertionSortList_147 = new InsertionSortList_147();
        ListNode head = InsertionSortList_147.insertionSortList(node1);
        int i = 1;
        while(head != null) {
            assertEquals(head.val, i++);
            head = head.next;
        }
    }

    @Test
    public void insertionSortList_2() {
        ListNode node1 = new ListNode(-1);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(0);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        InsertionSortList_147 InsertionSortList_147 = new InsertionSortList_147();
        ListNode head = InsertionSortList_147.insertionSortList(node1);
        int[] nums = {-1,0,3,4,5};
        for (int i = 0; i < nums.length; i++) {
            assertEquals(nums[i], head.val);
            head = head.next;
        }
    }
}