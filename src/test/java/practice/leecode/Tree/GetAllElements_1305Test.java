package practice.leecode.Tree;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;
import practice.utils.TreeNode;

public class GetAllElements_1305Test {

    @Test
    public void getAllElements_1() {

        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(3);

        GetAllElements_1305 getAllElements_1305 = new GetAllElements_1305();
        List<Integer> nums = getAllElements_1305.getAllElements(root1, root2);

        assertArrayEquals(new int[]{0,1,1,2,3,4}, nums.stream().mapToInt(Integer::intValue).toArray());

    }

    @Test
    public void getAllElements_2() {

        TreeNode root1 = null;

        TreeNode root2 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(2);

        root2.left = node1;
        root2.right = node2;

        node1.left = node3;
        node1.right = node4;

        GetAllElements_1305 getAllElements_1305 = new GetAllElements_1305();
        List<Integer> nums = getAllElements_1305.getAllElements(root1, root2);

        assertArrayEquals(new int[]{0,1,2,5,7}, nums.stream().mapToInt(Integer::intValue).toArray());

    }
}