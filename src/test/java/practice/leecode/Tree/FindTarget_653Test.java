package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.assertEquals;

public class FindTarget_653Test {

    @Test
    public void findTarget1() {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;

        FindTarget_653 findTarget_653 = new FindTarget_653();
        assertEquals(true, findTarget_653.findTarget(root, 9));
    }

    @Test
    public void findTarget2() {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;

        FindTarget_653 findTarget_653 = new FindTarget_653();
        assertEquals(false, findTarget_653.findTarget(root, 28));
    }

    @Test
    public void findTarget3() {
        TreeNode root = new TreeNode(1);
        FindTarget_653 findTarget_653 = new FindTarget_653();
        assertEquals(false, findTarget_653.findTarget(root, 2));
    }

    @Test
    public void findTarget4() {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(3);
        root.right = node1;

        FindTarget_653 findTarget_653 = new FindTarget_653();
        assertEquals(false, findTarget_653.findTarget(root, 6));
    }

    @Test
    public void findTarget5() {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);

        root.left = node1;
        root.right = node2;

        FindTarget_653 findTarget_653 = new FindTarget_653();
        assertEquals(true, findTarget_653.findTarget(root, 4));
    }

    //[2,0,3,-4,1]
    @Test
    public void findTarget6() {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(-4);
        TreeNode node4 = new TreeNode(1);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        FindTarget_653 findTarget_653 = new FindTarget_653();
        assertEquals(true, findTarget_653.findTarget(root, -1));
    }

}