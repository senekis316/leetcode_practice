package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.Node;

import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;
import static org.junit.Assert.*;

public class LevelOrder_429Test {

    @Test
    public void levelOrder() {

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

        List<List<Integer>> levelNodesList = new LevelOrder_429().levelOrder(root);

        List<Integer> level1 = new ArrayList<>();
        level1.add(1);

        List<Integer> level2 = new ArrayList<>();
        level2.add(3);
        level2.add(2);
        level2.add(4);

        List<Integer> level3 = new ArrayList<>();
        level3.add(5);
        level3.add(6);

        List<List<Integer>> result = new ArrayList<>();
        result.add(level1);
        result.add(level2);
        result.add(level3);

        assertEquals(result, levelNodesList);

    }
}