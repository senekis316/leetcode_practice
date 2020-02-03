package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class SumOfLeftLeaves_404Test {

    @Test
    public void sumOfLeftLeaves1() {

        TreeNode root =  new TreeNode(3);
        TreeNode node1 =  new TreeNode(9);
        TreeNode node2 =  new TreeNode(20);
        TreeNode node3 =  new TreeNode(15);
        TreeNode node4 =  new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        SumOfLeftLeaves_404 sumOfLeftLeaves_404 = new SumOfLeftLeaves_404();
        assertEquals(24, sumOfLeftLeaves_404.sumOfLeftLeaves(root));

    }

    @Test
    public void sumOfLeftLeaves2() {

        TreeNode root =  new TreeNode(1);
        TreeNode node1 =  new TreeNode(2);
        TreeNode node2 =  new TreeNode(3);
        TreeNode node3 =  new TreeNode(4);
        TreeNode node4 =  new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        SumOfLeftLeaves_404 sumOfLeftLeaves_404 = new SumOfLeftLeaves_404();
        assertEquals(4, sumOfLeftLeaves_404.sumOfLeftLeaves(root));

    }

}