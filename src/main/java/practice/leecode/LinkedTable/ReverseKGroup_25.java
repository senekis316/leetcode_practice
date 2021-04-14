package practice.leecode.LinkedTable;

import practice.utils.ListNode;


public class ReverseKGroup_25 {

    public ListNode reverseKGroup(ListNode node, int k) {
        if (node == null || k <= 1) return node;
        ListNode temp = new ListNode(-1, node);
        ListNode head = temp, tail = temp;
        while (tail != null) {
            for (int i = 0; i < k && tail != null; i++) {
                tail = tail.next;
            }
            if (tail != null) {
                ListNode curr = head.next;
                ListNode next = tail.next;
                head.next = reverse(curr, k);
                curr.next = next;
                head = curr;
                tail = head;
            }
        }
        return temp.next;
    }

    private ListNode reverse(ListNode node, int k) {
        ListNode prev = null;
        ListNode curr = node;
        ListNode next;
        for (int i = 0; i < k && curr != null; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
























//    public ListNode reverseKGroup(ListNode node, int k) {
//        if (node == null || k <= 1) return node;
//        ListNode temp = new ListNode(-1, node);
//        ListNode head = temp, tail = temp;
//        while (tail != null) {
//            for (int i = 0; i < k && tail != null; i++) {
//                tail = tail.next;
//            }
//            if (tail != null) {
//                ListNode curr = head.next;
//                ListNode next = tail.next;
//                head.next = reverse(curr, k);
//                curr.next = next;
//                head = curr;
//                tail = head;
//            }
//        }
//        return temp.next;
//    }
//
//    public ListNode reverse(ListNode node, int k){
//        ListNode prev = null;
//        ListNode curr = node;
//        ListNode next;
//        for (int i = 0; i < k && curr != null; i++) {
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }









    /*public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = new ListNode();
        prev.next = head;
        List<ListNode> subNodes = new ArrayList<>();
        subNodes.add(prev);
        while (head != null) {
            if (subNodes.size() <= k) {
                subNodes.add(head);
                head = head.next;
            }
            if (subNodes.size() > k) {
                ListNode tail = subNodes.get(k).next;
                for (int i = k; i > 1; i--) {
                    subNodes.get(i).next = subNodes.get(i - 1);
                }
                subNodes.get(0).next = subNodes.get(k);
                subNodes.get(1).next = tail;
                for (int i = k; i >= 0; i--) {
                    if (i != 1) {
                        subNodes.remove(i);
                    }
                }
                head = subNodes.get(0).next;
            }
        }
        return prev.next;
    }*/

}
