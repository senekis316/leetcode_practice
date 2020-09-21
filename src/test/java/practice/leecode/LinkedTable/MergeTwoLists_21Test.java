package practice.leecode.LinkedTable;

import lombok.val;
import org.junit.Test;
import practice.utils.ListNode;

import static org.junit.Assert.*;

public class MergeTwoLists_21Test {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        MergeTwoLists_21 mergeTwoLists_21 = new MergeTwoLists_21();
        ListNode r1 = mergeTwoLists_21.mergeTwoLists(l1, l2);

        int[] expect = new int[]{1,1,2,3,4,4};
        for (int i = 0; i < expect.length; i++) {
            assertEquals(expect[i], r1.val);
            r1 = r1.next;
        }
    }
}