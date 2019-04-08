package practice.leecode.qq.LinkedTable;



public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode s1 = l1;
        ListNode s2 = l2;
        ListNode merge = new ListNode(0);
        ListNode head = merge;
        ListNode tmp;

        while(s1!=null && s2!=null) {

            if (s1.val <= s2.val) {
                tmp = new ListNode(s1.val);
                s1 = s1.next;
            } else {
                tmp = new ListNode(s2.val);
                s2 = s2.next;
            }

            merge.next = tmp;
            merge = tmp;

        }

        while(s1!=null) {
            tmp = new ListNode(s1.val);
            merge.next = tmp;
            merge = tmp;
            s1 = s1.next;
        }

        while(s2!=null) {
            tmp = new ListNode(s2.val);
            merge.next = tmp;
            merge = tmp;
            s2 = s2.next;
        }

        return head.next;

    }
}
