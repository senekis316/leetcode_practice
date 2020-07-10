package practice.leecode.LinkedTable;

import java.util.ArrayList;
import java.util.List;
import practice.utils.ListNode;

public class AddTwoNumbers_445 {

    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> nums1 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        reverseAdd(l1, nums1);
        reverseAdd(l2, nums2);
        int carry = 0;
        int count = Math.max(nums1.size(), nums2.size());
        ListNode temp = new ListNode(-1);
        ListNode head = temp;
        for (int i = 0; i < count; i++) {
            int num1 = i < nums1.size() ? nums1.get(i) : 0;
            int num2 = i < nums2.size() ? nums2.get(i) : 0;
            int sum = num1 + num2 + carry;
            carry = sum >= 10 ? 1 : 0;
            ListNode node = sum < 10 ? new ListNode(sum) : new ListNode(sum % 10);
            head.next = node;
            head = head.next;
        }
        if (carry != 0) {
            head.next = new ListNode(carry);
        }
        temp = temp.next;
        List<Integer> nums3 = new ArrayList<>();
        reverseAdd(temp, nums3);
        head = new ListNode(-1);
        temp = head;
        for (int i = 0; i < nums3.size(); i++) {
            head.next = new ListNode(nums3.get(i));
            head = head.next;
        }
        return temp.next;
    }

    private void reverseAdd(ListNode head, List<Integer> nums) {
        if (head != null) {
           reverseAdd(head.next, nums);
           nums.add(head.val);
        }
    }*/

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        int carry = 0;
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum < 10 ? 0 : 1;
            head.next = new ListNode(sum % 10);
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = l1.val + carry;
            carry = sum < 10 ? 0 : 1;
            head.next = new ListNode(sum % 10);
            head = head.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = l2.val + carry;
            carry = sum < 10 ? 0 : 1;
            head.next = new ListNode(sum % 10);
            head = head.next;
            l2 = l2.next;
        }
        if (carry == 1) {
            head.next = new ListNode(carry);
            head = head.next;
        }
        return reverse(temp.next);
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tail = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return tail;
    }

}
