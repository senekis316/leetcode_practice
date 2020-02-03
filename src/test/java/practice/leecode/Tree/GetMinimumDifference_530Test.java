package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class GetMinimumDifference_530Test {

    @Test
    public void getMinimumDifference1() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        root.right = node1;
        node1.left = node2;
        assertEquals(1, new GetMinimumDifference_530().getMinimumDifference(root));
    }

    @Test
    public void getMinimumDifference2() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        root.right = node1;
        node1.left = node2;
        assertEquals(2, new GetMinimumDifference_530().getMinimumDifference(root));
    }

    @Test
    public void getMinimumDifference3() {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        assertEquals(1, new GetMinimumDifference_530().getMinimumDifference(root));
    }


}