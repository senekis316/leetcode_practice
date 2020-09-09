package practice.leecode.LinkedTable;

import org.junit.Test;
import practice.leecode.LinkedTable.CopyRandomList_138.Node;

import static org.junit.Assert.*;

public class CopyRandomList_138Test {

    @Test
    public void copyRandomList_1() {

        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        CopyRandomList_138 copyRandomList_138 = new CopyRandomList_138();

        Node head = node1;
        Node curr = copyRandomList_138.copyRandomList(node1);

        while(head.next != null) {
            assertEquals(head.val, curr.val);
            assertTrue((head.next == null && curr.next == null) || head.next.val == curr.next.val);
            assertTrue((head.random == null && curr.random == null) || head.random.val == curr.random.val);
            head = head.next;
            curr = curr.next;
        }

        //[[7,null],[13,0],[11,4],[10,2],[1,0]]
    }

    @Test
    public void copyRandomList_2() {

    }

}