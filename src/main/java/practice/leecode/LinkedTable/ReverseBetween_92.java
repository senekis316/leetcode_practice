package practice.leecode.LinkedTable;

import practice.utils.ListNode;

public class ReverseBetween_92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }
        if (n == 1) {
            return head;
        }
        ListNode prev = null, curr = head;
        while (m > 1) {
            prev = curr;
            curr = curr.next;
            m--;
            n--;
        }
        ListNode temp = prev, tail = curr, next;
        while (n > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            n--;
        }
        if (temp != null) {
            temp.next = prev;
        } else {
            head = prev;
        }
        tail.next = curr;
        return head;
    }

}
