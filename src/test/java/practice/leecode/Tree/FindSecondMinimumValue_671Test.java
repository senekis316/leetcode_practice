package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class FindSecondMinimumValue_671Test {

    @Test
    public void findSecondMinimumValue1() {

        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        assertEquals(5, new FindSecondMinimumValue_671().findSecondMinimumValue(root));

    }

    @Test
    public void findSecondMinimumValue2() {

        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);

        root.left = node1;
        root.right = node2;

        assertEquals(-1, new FindSecondMinimumValue_671().findSecondMinimumValue(root));

    }

    @Test
    public void findSecondMinimumValue3() {

        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(8);
        TreeNode node2 = new TreeNode(5);

        root.left = node1;
        root.right = node2;

        assertEquals(5, new FindSecondMinimumValue_671().findSecondMinimumValue(root));

    }



}