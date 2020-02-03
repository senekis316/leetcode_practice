package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class DeepestLeavesSum_5153Test {

    @Test
    public void deepestLeavesSum() {
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(8);
        TreeNode root = new TreeNode(1);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;
        node3.left = node6;
        node5.right = node7;

        DeepestLeavesSum_5153 deepestLeavesSum_5153 = new DeepestLeavesSum_5153();
        assertEquals(15, deepestLeavesSum_5153.deepestLeavesSum(root));
    }
}