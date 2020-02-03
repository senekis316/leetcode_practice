package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class FindBottomLeftValue_513Test {

    @Test
    public void findBottomLeftValue_1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        FindBottomLeftValue_513 findBottomLeftValue_513 = new FindBottomLeftValue_513();
        assertEquals(1, findBottomLeftValue_513.findBottomLeftValue(root));
    }

    @Test
    public void findBottomLeftValue_2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        FindBottomLeftValue_513 findBottomLeftValue_513 = new FindBottomLeftValue_513();
        assertEquals(7, findBottomLeftValue_513.findBottomLeftValue(root));
    }

}