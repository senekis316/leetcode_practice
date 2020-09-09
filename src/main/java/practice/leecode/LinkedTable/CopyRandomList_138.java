package practice.leecode.LinkedTable;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList_138 {


    //方法2
    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        Node prev = head;

        while(prev != null) {
            Node next = prev.next;
            prev.next = new Node(prev.val);
            prev.next.next = next;
            prev = next;
        }

        prev = head;
        while(prev != null) {
            if (prev.random != null) {
                prev.next.random = prev.random.next;
            }
            prev = prev.next.next;
        }

        prev = head;
        Node next = head.next;
        while(prev != null) {
            Node curr = prev.next;
            prev.next = curr.next;
            if (prev.next == null) {
                curr.next = null;
            } else {
                curr.next = curr.next.next;
            }
            prev = prev.next;
        }

        return next;

    }

//    方法1: hashMap方法
//    public Node copyRandomList(Node head) {
//
//        Map<Node, Node> nodeMap = new HashMap();
//
//        Node prev = head;
//        while (prev != null) {
//            if (!nodeMap.containsKey(prev)) {
//                nodeMap.put(prev, new Node(prev.val));
//            }
//            prev = prev.next;
//        }
//
//        prev = head;
//        while (prev != null) {
//            Node curr = nodeMap.get(prev);
//            curr.next = nodeMap.get(prev.next);
//            curr.random = nodeMap.get(prev.random);
//            prev = prev.next;
//        }
//
//        return nodeMap.get(head);
//    }

    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}
