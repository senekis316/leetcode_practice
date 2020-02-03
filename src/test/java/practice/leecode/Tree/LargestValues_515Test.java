package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class LargestValues_515Test {

    @Test
    public void largestValues() {

        TreeNode root = new TreeNode(1);

        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);

        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(9);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.right = node5;

        LargestValues_515 largestValues_515 = new LargestValues_515();

        assertArrayEquals(new int[]{1,3,9}, largestValues_515.largestValues(root).stream().mapToInt(Integer::intValue).toArray());
    }
}