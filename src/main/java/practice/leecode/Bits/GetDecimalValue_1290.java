package practice.leecode.Bits;

import practice.utils.ListNode;

public class GetDecimalValue_1290 {

    public int getDecimalValue(ListNode head) {
        int sum = head.val;
        while(head.next != null) {
            head = head.next;
            sum = sum << 1;
            sum += head.val;
        }
        return sum;
    }

}
