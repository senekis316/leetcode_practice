package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class FindElements_1261Test {

    @Test
    public void find() {

        TreeNode root = new TreeNode(-1);
        TreeNode node1 = new TreeNode(-1);
        TreeNode node2 = new TreeNode(-1);
        TreeNode node3 = new TreeNode(-1);
        TreeNode node4 = new TreeNode(-1);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        FindElements_1261 findElements_1261 = new FindElements_1261(root);
        assertEquals(true, findElements_1261.find(1));
        assertEquals(true, findElements_1261.find(3));
        assertEquals(false, findElements_1261.find(5));

    }
}