package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import practice.utils.TreeNode;

public class FlipEquiv_951Test {

    private TreeNode root1;

    private TreeNode root2;

    @Before
    public void root1() {
        TreeNode root1 = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(8);

        root1.left = node1;
        root1.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node4.left = node6;
        node4.right = node7;

        this.root1 = root1;
    }

    @Before
    public void root2() {
        TreeNode root2 = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(8);

        root2.left = node2;
        root2.right = node1;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;
        node4.left = node7;
        node4.right = node6;

        this.root2 = root2;
    }

    @Test
    public void flipEquiv() {
        FlipEquiv_951 FlipEquiv_951 = new FlipEquiv_951();
        assertTrue(FlipEquiv_951.flipEquiv(root1, root2));
    }
}