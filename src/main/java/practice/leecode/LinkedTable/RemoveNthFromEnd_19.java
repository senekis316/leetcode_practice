package practice.leecode.LinkedTable;

import practice.utils.ListNode;

public class RemoveNthFromEnd_19 {


    /*public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }*/


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode orig = new ListNode(0);
        orig.next = head;
        ListNode slow = orig;
        ListNode fast = orig;
        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return orig.next;
    }

}
