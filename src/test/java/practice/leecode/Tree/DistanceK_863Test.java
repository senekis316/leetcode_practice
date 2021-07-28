package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DistanceK_863Test {

    @Test
    public void distanceK() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.left = node7;
        node4.right = node8;

        int k = 2;

        int[] expect = new int[]{7,4,1};

        DistanceK_863 distanceK_863 = new DistanceK_863();
        List<Integer> actual = distanceK_863.distanceK(root, node1, k);

        assertArrayEquals(actual.stream().mapToInt(Integer::intValue).toArray(), expect);

    }

}