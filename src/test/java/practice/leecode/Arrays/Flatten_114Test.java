package practice.leecode.Arrays;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import practice.utils.TreeNode;

public class Flatten_114Test {

    @Test
    public void flatten_1() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(6);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;
        node2.right = node5;

        Flatten_114 flatten_114 = new Flatten_114();
        flatten_114.flatten(root);

        List<Integer> inOrder = inOrder(root, new ArrayList<>());
        List<Integer> expect = Arrays.stream(new Integer[]{1,null,2,null,3,null,4,null,5,null,6}).collect(
            Collectors.toList());
        for (int i = 0; i < inOrder.size(); i++) {
            System.out.println(inOrder.get(i));
        }
        for(int i = 0; i < inOrder.size(); i++) {
            assertEquals(expect.get(i), inOrder.get(i));
        }

    }

    @Test
    public void flatten_2() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        root.right = node1;
        node1.left = node2;

        Flatten_114 flatten_114 = new Flatten_114();
        flatten_114.flatten(root);

        List<Integer> inOrder = inOrder(root, new ArrayList<>());
        List<Integer> expect = Arrays.stream(new Integer[]{1,null,2,null,3}).collect(Collectors.toList());
        for (int i = 0; i < inOrder.size(); i++) {
            System.out.println(inOrder.get(i));
        }
        for(int i = 0; i < inOrder.size(); i++) {
            assertEquals(expect.get(i), inOrder.get(i));
        }
    }

    private List<Integer> inOrder(TreeNode root, List<Integer> nums) {
        if (root == null) {
            return nums;
        }
        nums.add(root.val);
        if (root.left != null || root.right != null) {
            nums.add(null);
        }
        inOrder(root.right, nums);
        return nums;
    }
}