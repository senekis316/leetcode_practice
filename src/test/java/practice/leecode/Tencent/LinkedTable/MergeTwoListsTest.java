package practice.leecode.Tencent.LinkedTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoListsTest {

    @Test
    public void mergeTwoLists() {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode head = mergeTwoLists.mergeTwoLists(l1, l2);

        int[] nums = new int[]{1,1,2,3,4,4};
        for (int i=0; i<nums.length; i++) {
            assertEquals(nums[i], head.val);
            head = head.next;
        }

    }
}