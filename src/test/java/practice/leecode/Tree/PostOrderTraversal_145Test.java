package practice.leecode.Tree;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;
import practice.utils.TreeNode;

public class PostOrderTraversal_145Test {

    @Test
    public void postOrderTraversal() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        root.right = node1;
        node1.left = node2;

        PostOrderTraversal_145 postOrderTraversal = new PostOrderTraversal_145();
        postOrderTraversal.postOrderTraversal(root);

        assertArrayEquals(new int[]{3,2,1}, postOrderTraversal.postOrderTraversal(root).stream().mapToInt(Integer::intValue).toArray());
    }
}