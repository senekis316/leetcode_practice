package practice.leecode.LinkedTable;

import practice.utils.ListNode;

public class MiddleNode_876 {


    //方法一: 计算中间值法
    /*public ListNode middleNode(ListNode head) {
        ListNode middle = head;

        int length = 0;
        int middleIndex = 0;

        while(head.next != null) {
            length++;
            middleIndex = length / 2 + length % 2;
            head = head.next;
        }

        for (int i = 0; i < middleIndex; i++) {
            middle = middle.next;
        }

        return middle;

    }*/

    //方法二: 快慢指针法
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
