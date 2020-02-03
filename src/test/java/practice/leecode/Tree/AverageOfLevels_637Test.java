package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import java.util.List;

import static org.junit.Assert.*;

public class AverageOfLevels_637Test {

    @Test
    public void averageOfLevels() {

        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        AverageOfLevels_637 averageOfLevels_637 = new AverageOfLevels_637();
        List<Double> averageOfLevels = averageOfLevels_637.averageOfLevels(root);

        assertEquals(3, averageOfLevels.size());
        assertEquals(3.0, averageOfLevels.get(0), 1);
        assertEquals(14.5, averageOfLevels.get(1), 1);
        assertEquals(11, averageOfLevels.get(2), 1);

    }
}