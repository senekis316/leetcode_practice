package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import java.util.List;
import static org.junit.Assert.*;


public class LevelOrder_102Test {

    @Test
    public void levelOrder() {

        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);

        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        TreeNode root = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        List<List<Integer>> levels = new LevelOrder_102().levelOrder(root);
        assertEquals(3, levels.size());
        assertArrayEquals(new int[]{3}, levels.get(0).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{9,20}, levels.get(1).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{15,7}, levels.get(2).stream().mapToInt(Integer::intValue).toArray());

    }
}