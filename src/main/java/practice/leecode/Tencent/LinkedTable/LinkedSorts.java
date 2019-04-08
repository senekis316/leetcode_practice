package practice.leecode.Tencent.LinkedTable;

import java.util.ArrayList;
import java.util.List;


public class LinkedSorts {


    public ListNode sortList(ListNode head) {

        if (head != null) {

            List<ListNode> nodes = new ArrayList();

            for (ListNode e = head; e != null; e = e.next) {
                nodes.add(e);
            }

            quickSort(nodes, 0, nodes.size() - 1);

        }

        return head;
    }

    private void quickSort(List<ListNode> nodes, int left, int right) {

        int start = left;
        int end = right;
        int mid = nodes.get(start).val;

        while(end > start) {

            while(end > start && nodes.get(end).val >= mid) {
                end--;
            }

            while(end > start && nodes.get(start).val <= mid) {
                start++;
            }

            if (start != end) {
                int temp = nodes.get(start).val;
                nodes.get(start).val = nodes.get(end).val;
                nodes.get(end).val = temp;
            }

        }

        nodes.get(left).val = nodes.get(start).val;
        nodes.get(start).val = mid;

        if (left < end) {
            quickSort(nodes, left, end);
        }

        if (start < right) {
            quickSort(nodes, start + 1, right);
        }

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /*public ListNode sortList(ListNode head) {
        return head == null ? null : mergeSort(head);
    }

    private ListNode mergeSort(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode p = head, q = head, pre = null;
        while (q != null && q.next != null) {
            pre = p;
            p = p.next;
            q = q.next.next;
        }
        pre.next = null;
        ListNode l = mergeSort(head);
        ListNode r = mergeSort(p);
        return merge(l, r);
    }

    ListNode merge(ListNode l, ListNode r) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l != null && r != null) {
            if (l.val <= r.val) {
                cur.next = l;
                cur = cur.next;
                l = l.next;
            } else {
                cur.next = r;
                cur = cur.next;
                r = r.next;
            }
        }
        if (l != null) {
            cur.next = l;
        }
        if (r != null) {
            cur.next = r;
        }
        return dummyHead.next;
    }*/

}
