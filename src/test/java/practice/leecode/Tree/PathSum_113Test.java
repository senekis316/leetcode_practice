package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import java.util.List;

import static org.junit.Assert.*;

public class PathSum_113Test {

    @Test
    public void pathSum() {

        TreeNode root = new TreeNode(5);

        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(8);

        TreeNode node3 = new TreeNode(11);
        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(4);

        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(2);

        TreeNode node8 = new TreeNode(5);
        TreeNode node9 = new TreeNode(1);

        root.left = node1;
        root.right = node2;

        node1.left = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        node5.left = node8;
        node5.right = node9;

        PathSum_113 pathSum_113 = new PathSum_113();
        List<List<Integer>> paths = pathSum_113.pathSum(root, 22);

        assertEquals(2, paths.size());
        assertArrayEquals(new int[]{5,4,11,2}, paths.get(0).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{5,8,4,5}, paths.get(1).stream().mapToInt(Integer::intValue).toArray());

    }
}