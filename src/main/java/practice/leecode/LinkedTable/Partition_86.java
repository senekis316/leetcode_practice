package practice.leecode.LinkedTable;

import practice.utils.ListNode;

public class Partition_86 {

    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(0);
        ListNode largeHead = new ListNode(0);
        ListNode small = smallHead;
        ListNode large = largeHead;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
            small.next = null;
            large.next = null;
        }
        small.next = largeHead.next;
        return smallHead.next != null ? smallHead.next : largeHead.next;
    }

}
