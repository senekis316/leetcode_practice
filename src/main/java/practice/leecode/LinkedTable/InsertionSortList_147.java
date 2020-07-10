package practice.leecode.LinkedTable;

import practice.utils.ListNode;

public class InsertionSortList_147 {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next;
        ListNode prev;
        ListNode temp = new ListNode(0);
        temp.next = head;
        while (head != null && head.next != null) {
            if (head.val > head.next.val) {
                prev = temp;
                while (prev.next.val < head.next.val) {
                    prev = prev.next;
                }
                next = head.next;
                head.next = next.next;
                next.next = prev.next;
                prev.next = next;
            } else {
                head = head.next;
            }
        }
        return temp.next;
    }

    /*public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp;
        ListNode prev;
        ListNode next;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            next = curr.next;
            if (curr.val > next.val) {
                curr.next = next.next;
                temp = head;
                prev = null;
                while (temp != null) {
                    if (next.val < temp.val) {
                       if (prev == null) {
                           next.next = temp;
                           head = next;
                           break;
                       } else {
                           prev.next = next;
                           next.next = temp;
                           break;
                       }
                    }
                    prev = temp;
                    temp = temp.next;
                }
            } else {
                curr = curr.next;
            }
        }
        return head;
    }*/

}
