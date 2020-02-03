package practice.leecode;

public class RemoveLinkedElements_213 {

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return head;
        }

        ListNode first = new ListNode(0);
        first.next = head;

        ListNode temp = first;

        while(first.next != null) {
            if (first.next.val == val) {
                first.next = first.next.next;
            } else {
                first = first.next;
            }
        }

        return temp.next;

    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
