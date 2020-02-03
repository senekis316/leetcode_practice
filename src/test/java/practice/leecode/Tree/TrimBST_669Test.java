package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class TrimBST_669Test {


    @Test
    public void trimBST1() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(2);

        root.left = node1;
        root.right = node2;

        TrimBST_669 trimBST_669 = new TrimBST_669();
        trimBST_669.trimBST(root, 1, 2);

        assertEquals(1, root.val);
        assertEquals(2, root.right.val);

    }

    @Test
    public void trimBST2() {

        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(1);

        root.left = node1;
        root.right = node2;
        node1.right = node3;
        node3.left = node4;

        TrimBST_669 trimBST_669 = new TrimBST_669();
        trimBST_669.trimBST(root, 1, 3);

        assertEquals(3, root.val);
        assertEquals(2, root.left.val);
        assertEquals(1, root.left.left.val);

    }


}