package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class IsSubtree_572Test {

    @Test
    public void isSubtree1() {

        TreeNode sTree = new TreeNode(3);
        TreeNode sNode1 = new TreeNode(4);
        TreeNode sNode2 = new TreeNode(5);
        TreeNode sNode3 = new TreeNode(1);
        TreeNode sNode4 = new TreeNode(2);

        sTree.left = sNode1;
        sTree.right = sNode2;
        sNode1.left = sNode3;
        sNode1.right = sNode4;

        TreeNode tTree = new TreeNode(4);
        TreeNode tNode1 = new TreeNode(1);
        TreeNode tNode2 = new TreeNode(2);

        tTree.left = tNode1;
        tTree.right = tNode2;

        IsSubtree_572 isSubtree_572 = new IsSubtree_572();
        assertEquals(true, isSubtree_572.isSubtree(sTree, tTree));

    }

    @Test
    public void isSubtree2() {

        TreeNode sTree = new TreeNode(3);
        TreeNode sNode1 = new TreeNode(4);
        TreeNode sNode2 = new TreeNode(5);
        TreeNode sNode3 = new TreeNode(1);
        TreeNode sNode4 = new TreeNode(2);
        TreeNode sNode5 = new TreeNode(0);

        sTree.left = sNode1;
        sTree.right = sNode2;
        sNode1.left = sNode3;
        sNode1.right = sNode4;
        sNode4.left = sNode5;

        TreeNode tTree = new TreeNode(4);
        TreeNode tNode1 = new TreeNode(1);
        TreeNode tNode2 = new TreeNode(2);

        tTree.left = tNode1;
        tTree.right = tNode2;

        IsSubtree_572 isSubtree_572 = new IsSubtree_572();
        assertEquals(false, isSubtree_572.isSubtree(sTree, tTree));

    }


}