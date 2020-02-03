package practice.leecode.Tree;

import static org.junit.Assert.*;

import java.util.stream.Collectors;
import org.junit.Test;
import practice.utils.TreeNode;

public class PreOrderTraversal_144Test {

    @Test
    public void preOrderTraversal_1() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        root.right = node1;
        node1.left = node2;

        PreOrderTraversal_144 preOrderTraversal_144 = new PreOrderTraversal_144();
        assertArrayEquals(new int[]{1,2,3}, preOrderTraversal_144.preOrderTraversal(root).stream().mapToInt(Integer::intValue).toArray());

    }

    @Test
    public void preOrderTraversal_2() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        PreOrderTraversal_144 preOrderTraversal_144 = new PreOrderTraversal_144();
        assertArrayEquals(new int[]{1,2,3,4,5}, preOrderTraversal_144.preOrderTraversal(root).stream().mapToInt(Integer::intValue).toArray());

    }
}