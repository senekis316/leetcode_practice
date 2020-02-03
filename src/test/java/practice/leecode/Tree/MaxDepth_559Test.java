package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.Node;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MaxDepth_559Test {

    @Test
    public void maxDepth() {

        Node node2 = new Node(2, null);
        Node node3 = new Node(4, null);

        Node node4 = new Node(5, null);
        Node node5 = new Node(6, null);

        List<Node> level2Nodes = new ArrayList<>();
        level2Nodes.add(node4);
        level2Nodes.add(node5);

        Node node1 = new Node(3, level2Nodes);

        List<Node> level1Nodes = new ArrayList<>();
        level1Nodes.add(node1);
        level1Nodes.add(node2);
        level1Nodes.add(node3);

        Node root = new Node(1, level1Nodes);

        MaxDepth_559 maxDepth_559 = new MaxDepth_559();
        assertEquals(3, maxDepth_559.maxDepth(root));

    }
}