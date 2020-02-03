package practice.leecode.Tree;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;
import practice.utils.TreeNode;

public class RightSideView_199Test {

    @Test
    public void rightSideView() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);

        root.left = node1;
        root.right = node2;

        node1.right = node3;
        node2.right = node4;

        RightSideView_199 RightSideView_199 = new RightSideView_199();
        List<Integer> nums = RightSideView_199.rightSideView(root);

        assertArrayEquals(new int[]{1,3,4}, nums.stream().mapToInt(Integer::intValue).toArray());

    }
}