package practice.leecode;

import org.junit.Test;
import practice.leecode.Tree.MergeTrees_617;
import practice.utils.TreeNode;

import static org.junit.Assert.*;

public class MergeTrees_617Test {

    @Test
    public void mergeTrees() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);

        new MergeTrees_617().mergeTrees(t1, t2);

        assertEquals(3, t1.val);
        assertEquals(4, t1.left.val);
        assertEquals(5, t1.right.val);
        assertEquals(5, t1.left.left.val);
        assertEquals(4, t1.left.right.val);
        assertEquals(7, t1.right.right.val);


    }


}