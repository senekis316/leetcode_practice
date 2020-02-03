package practice.leecode.Tree;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;
import practice.utils.TreeNode;

public class ZigzagLevelOrder_103Test {

    @Test
    public void zigzagLevelOrder_1() {

        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        ZigzagLevelOrder_103 zigzagLevelOrder_103 = new ZigzagLevelOrder_103();
        List<List<Integer>> zigzagLevelOrders = zigzagLevelOrder_103.zigzagLevelOrder(root);

        assertEquals(3, zigzagLevelOrders.size());
        assertArrayEquals(new int[] {3}, zigzagLevelOrders.get(0).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[] {20,9}, zigzagLevelOrders.get(1).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[] {15,7}, zigzagLevelOrders.get(2).stream().mapToInt(Integer::intValue).toArray());

    }
}