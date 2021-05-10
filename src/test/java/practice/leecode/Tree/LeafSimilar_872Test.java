package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class LeafSimilar_872Test {

    private TreeNode getRoot1() {
        TreeNode root1 = new TreeNode(3);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(9);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(4);
        root1.left = node1;
        root1.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.left = node7;
        node4.right = node8;
        return root1;
    }

    private TreeNode getRoot2() {
        TreeNode root2 = new TreeNode(3);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(2);
        TreeNode node7 = new TreeNode(9);
        TreeNode node8 = new TreeNode(8);
        root2.left = node1;
        root2.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node6.left = node7;
        node6.right = node8;
        return root2;
    }

    @Test
    public void leafSimilar_1() {
        LeafSimilar_872 leafSimilar_872 = new LeafSimilar_872();
        assertTrue(leafSimilar_872.leafSimilar(getRoot1(), getRoot2()));
    }

    @Test
    public void leafSimilar_2() {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(1);
        LeafSimilar_872 leafSimilar_872 = new LeafSimilar_872();
        assertTrue(leafSimilar_872.leafSimilar(root1, root2));
    }

    @Test
    public void leafSimilar_3() {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        LeafSimilar_872 leafSimilar_872 = new LeafSimilar_872();
        assertFalse(leafSimilar_872.leafSimilar(root1, root2));
    }

    @Test
    public void leafSimilar_4() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);

        LeafSimilar_872 leafSimilar_872 = new LeafSimilar_872();
        assertTrue(leafSimilar_872.leafSimilar(root1, root2));
    }

    @Test
    public void leafSimilar_5() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(2);

        LeafSimilar_872 leafSimilar_872 = new LeafSimilar_872();
        assertFalse(leafSimilar_872.leafSimilar(root1, root2));
    }

}