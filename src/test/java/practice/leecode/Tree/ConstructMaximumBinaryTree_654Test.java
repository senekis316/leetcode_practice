package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class ConstructMaximumBinaryTree_654Test {

    @Test
    public void constructMaximumBinaryTree_1() {
        ConstructMaximumBinaryTree_654 constructMaximumBinaryTree_654 = new ConstructMaximumBinaryTree_654();
        TreeNode root = constructMaximumBinaryTree_654.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
        assertEquals(6, root.val);
        assertEquals(3, root.left.val);
        assertEquals(5, root.right.val);
        assertEquals(2, root.left.right.val);
        assertEquals(1, root.left.right.right.val);
        assertEquals(0, root.right.left.val);
    }
}