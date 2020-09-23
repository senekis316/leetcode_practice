package practice.leecode.LinkedTable;

import practice.utils.ListNode;

public class SwapPairs_24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode prev = temp;
        ListNode curr;
        ListNode next;
        while (prev.next != null && prev.next.next != null) {
            curr = prev.next;
            next = curr.next;
            curr.next = next.next;
            next.next = curr;
            prev.next = next;
            prev = curr;
        }
        return temp.next;
    }

    //方法二: 迭代法
    /*public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head.next;
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode curr;
        ListNode next;
        while (prev.next != null && prev.next.next != null) {
            curr = prev.next;
            next = curr.next;
            curr.next = next.next;
            next.next = curr;
            prev.next = next;
            prev = curr;
        }
        return temp;
    }*/

    //方法一: 递归法
    /*public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode next = head.next;
        curr.next = swapPairs(next.next);
        next.next = curr;
        return next;
    }*/

}
