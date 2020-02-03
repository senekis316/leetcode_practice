package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class FindFrequentTreeSum_508Test {

    @Test
    public void findFrequentTreeSum_1() {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-3);

        FindFrequentTreeSum_508 findFrequentTreeSum_508 = new FindFrequentTreeSum_508();
        assertArrayEquals(new int[]{2,-3,4}, findFrequentTreeSum_508.findFrequentTreeSum(root));

    }

    @Test
    public void findFrequentTreeSum_2() {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-5);

        FindFrequentTreeSum_508 findFrequentTreeSum_508 = new FindFrequentTreeSum_508();
        assertArrayEquals(new int[]{2}, findFrequentTreeSum_508.findFrequentTreeSum(root));

    }
}