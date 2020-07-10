package practice.leecode.LinkedTable;

import practice.utils.ListNode;

public class OddEvenList_328 {

    public ListNode oddEvenList(ListNode head) {
        if (head != null) {
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = head.next;
            while (even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }

}
