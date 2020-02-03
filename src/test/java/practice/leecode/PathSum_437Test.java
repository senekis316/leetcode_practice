package practice.leecode;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class PathSum_437Test {

    @Test
    public void pathSum() {

        TreeNode root = new TreeNode(10);

        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(-3);

        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(11);

        TreeNode node6 = new TreeNode(3);
        TreeNode node7 = new TreeNode(-2);
        TreeNode node8 = new TreeNode(1);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        node4.right = node8;

        PathSum_437 pathSum_437 = new PathSum_437();
        assertEquals(3, pathSum_437.pathSum(root, 8));

    }

}