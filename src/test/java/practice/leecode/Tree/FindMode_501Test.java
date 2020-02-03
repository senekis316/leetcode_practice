package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class FindMode_501Test {

    @Test
    public void findMode() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);

        root.right = node1;
        node1.left = node2;

        FindMode_501 findMode = new FindMode_501();
        assertArrayEquals(new int[]{2}, findMode.findMode(root));

    }
}