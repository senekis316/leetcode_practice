package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class InsertIntoBST_701Test {

    @Test
    public void insertIntoBST_1() {

        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        InsertIntoBST_701 insertIntoBST_701 = new InsertIntoBST_701();

        TreeNode resultNode = insertIntoBST_701.insertIntoBST(root, 5);
        assertEquals(5, resultNode.right.left.val);

    }
}