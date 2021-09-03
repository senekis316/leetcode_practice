package practice.leecode.LinkedTable;

import practice.utils.ListNode;

public class GetKthFromEnd_22 {

    // 双指针法
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode temp1 = head, temp2 = head;
        for (int i = 0; i < k; i++) {
            temp1 = temp1.next;
        }
        while (temp1 != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp2;
    }

    // 递归法
//    private int cur = 0;
//
//    public ListNode getKthFromEnd(ListNode head, int k) {
//        if (head.next != null) {
//            ListNode target = getKthFromEnd(head.next, k);
//            if (target != null) return target;
//            cur++;
//        } else {
//            cur = 1;
//        }
//        if (k == cur) {
//            return head;
//        }
//        return null;
//    }

}
