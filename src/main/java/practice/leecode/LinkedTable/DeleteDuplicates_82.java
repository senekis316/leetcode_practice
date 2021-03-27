package practice.leecode.LinkedTable;

import practice.utils.ListNode;

public class DeleteDuplicates_82 {

    private boolean repeat;

    public ListNode deleteDuplicates(ListNode head) {
        this.repeat = false;
        return deleteDuplicates(head, 0);
    }

    public ListNode deleteDuplicates(ListNode head, int idx) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = deleteDuplicates(head.next, idx + 1);
        if (head.val == next.val) {
            repeat = true;
            return idx == 0 ? next.next : next;
        } else {
            if (repeat) {
                repeat = false;
                head.next = next.next;
            }
            return head;
        }
    }

}
