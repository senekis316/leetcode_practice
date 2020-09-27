package practice.leecode.LinkedTable;

import practice.utils.ListNode;

public class DeleteDuplicates_83 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return prev;
    }

}
