package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class BSTIterator_173Test {

    @Test
    public void next() {
        TreeNode root = new TreeNode(7);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(15);
        TreeNode node3 = new TreeNode(9);
        TreeNode node4 = new TreeNode(20);

        root.left = node1;
        root.right = node2;

        node2.left = node3;
        node2.right = node4;

        BSTIterator_173 bstIterator = new BSTIterator_173(root);
        assertEquals(3, bstIterator.next());
        assertEquals(7, bstIterator.next());
        assertEquals(true, bstIterator.hasNext());
        assertEquals(9, bstIterator.next());
        assertEquals(true, bstIterator.hasNext());
        assertEquals(15, bstIterator.next());
        assertEquals(true, bstIterator.hasNext());
        assertEquals(20, bstIterator.next());
        assertEquals(false, bstIterator.hasNext());

    }

    @Test
    public void hasNext() {

    }

}