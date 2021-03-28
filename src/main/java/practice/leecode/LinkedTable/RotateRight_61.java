package practice.leecode.LinkedTable;

import practice.utils.ListNode;

public class RotateRight_61 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int size = 1;
        ListNode temp = head;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        int mov = k % size;
        if (mov == 0) return head;
        temp.next = head;
        for (int i = 0; i < size - mov - 1; i++) {
            head = head.next;
        }
        temp = head.next;
        head.next = null;
        return temp;
    }

//    public ListNode rotateRight(ListNode head, int k) {
//        List<ListNode> nodes = new ArrayList<>();
//        ListNode temp = head;
//        while (temp != null) {
//            nodes.add(temp);
//            temp = temp.next;
//        }
//        if (nodes.size() == 0 || nodes.size() == 1) return head;
//        int mov = k % nodes.size();
//        if (mov == 0) return head;
//        ListNode tail = nodes.get(nodes.size() - 1);
//        ListNode curr = nodes.get(nodes.size() - mov);
//        ListNode prev = nodes.get(nodes.size() - mov - 1);
//        tail.next = head;
//        prev.next = null;
//        return curr;
//    }

}
