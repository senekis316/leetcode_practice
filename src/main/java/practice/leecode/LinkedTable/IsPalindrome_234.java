package practice.leecode.LinkedTable;

import practice.utils.ListNode;

public class IsPalindrome_234 {

    //方法三: 快慢指针反转列表法
    public  boolean isPalindrome(ListNode head) {
        ListNode next;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            next = slow.next;
            fast = fast.next.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (prev != null && slow != null) {
            if (prev.val != slow.val) {
                return false;
            }
            prev = prev.next;
            slow = slow.next;
        }
        return true;
    }

    //方法二: 递归法
    /*public boolean isPalindrome(ListNode head) {
        int pos = 0;
        List<Integer> nums = reverse(head, new ArrayList<>());
        while(head != null) {
           if (nums.get(pos).intValue() != head.val) {
               return false;
           } else {
               pos++;
               head = head.next;
           }
        }
        return true;
    }

    public List<Integer> reverse(ListNode head, List<Integer> nums) {
        if (head != null) {
            reverse(head.next, nums);
            nums.add(head.val);
        }
        return nums;
    }*/

    //方法一: 数组双指针法
    /*public boolean isPalindrome(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        while(head != null) {
            nums.add(head.val);
            head = head.next;
        }
        for (int i = 0, j = nums.size() - 1; i < j; i++, j--) {
            if (nums.get(i).intValue() != nums.get(j).intValue()) {
                return false;
            }
        }
        return true;
    }*/

}
