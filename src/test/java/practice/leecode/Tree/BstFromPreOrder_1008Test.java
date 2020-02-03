package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class BstFromPreOrder_1008Test {

    @Test
    public void bstFromPreOrder() {
        BstFromPreOrder_1008 bstFromPreOrder = new BstFromPreOrder_1008();
        TreeNode root = bstFromPreOrder.bstFromPreOrder(new int[]{8,5,1,7,10,12});
        assertEquals(8, root.val);
        assertEquals(5, root.left.val);
        assertEquals(10, root.right.val);
        assertEquals(1, root.left.left.val);
        assertEquals(12, root.right.right.val);
    }
}