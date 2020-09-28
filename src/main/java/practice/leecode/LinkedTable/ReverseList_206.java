package practice.leecode.LinkedTable;

import practice.utils.ListNode;

public class ReverseList_206 {

    // 方法2: 递归法
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode next = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return next;
//    }

    //方法1: 迭代法
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
