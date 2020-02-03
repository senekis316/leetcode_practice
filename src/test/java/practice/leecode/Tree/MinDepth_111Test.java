package practice.leecode.Tree;

import org.junit.Test;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class MinDepth_111Test {

    @Test
    public void minDepth() {

        TreeNode root =  new TreeNode(3);
        TreeNode node1 =  new TreeNode(9);
        TreeNode node2 =  new TreeNode(20);
        TreeNode node3 =  new TreeNode(15);
        TreeNode node4 =  new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        MinDepth_111 minDepth_111 = new MinDepth_111();
        assertEquals(2, minDepth_111.minDepth(root));

    }

}