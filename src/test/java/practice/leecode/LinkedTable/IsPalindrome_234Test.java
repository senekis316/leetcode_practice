package practice.leecode.LinkedTable;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.ListNode;

public class IsPalindrome_234Test {

    @Test
    public void isPalindrome_1() {
        ListNode head = new ListNode(1);
        ListNode next = new ListNode(2);
        head.next = next;
        IsPalindrome_234 IsPalindrome_234 = new IsPalindrome_234();
        assertFalse(IsPalindrome_234.isPalindrome(head));
    }

    @Test
    public void isPalindrome_2() {
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(2);
        ListNode next3 = new ListNode(1);
        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        IsPalindrome_234 IsPalindrome_234 = new IsPalindrome_234();
        assertTrue(IsPalindrome_234.isPalindrome(head));
    }

    @Test
    public void isPalindrome_3() {
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(3);
        ListNode next3 = new ListNode(2);
        ListNode next4 = new ListNode(1);
        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        next3.next = next4;
        IsPalindrome_234 IsPalindrome_234 = new IsPalindrome_234();
        assertTrue(IsPalindrome_234.isPalindrome(head));
    }

    @Test
    public void isPalindrome_4() {
        ListNode head = new ListNode(-129);
        ListNode next = new ListNode(-129);
        head.next = next;
        IsPalindrome_234 IsPalindrome_234 = new IsPalindrome_234();
        assertTrue(IsPalindrome_234.isPalindrome(head));
    }

}