package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.leecode.Common.Node;

public class Connect_116Test {

    @Test
    public void connect() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        Connect_116 Connect_116 = new Connect_116();
        Connect_116.connect(node1);

        assertTrue(node1.next == null);
        assertTrue(node2.next == node3);
        assertTrue(node3.next == null);
        assertTrue(node4.next == node5);
        assertTrue(node5.next == node6);
        assertTrue(node6.next == node7);
        assertTrue(node7.next == null);
    }
}