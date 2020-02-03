package practice.leecode.Tree;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import practice.utils.TreeNode;

public class BuildTree_105Test {

    @Test
    public void buildTree() {

        int[] inOrder = new int[]{9,3,15,20,7};
        int[] preOrder = new int[]{3,9,20,15,7};

        BuildTree_105 BuildTree_105 = new BuildTree_105();
        TreeNode root = BuildTree_105.buildTree(preOrder, inOrder);

        int[] inOrderResult = inOrder(root, new ArrayList<>()).stream().mapToInt(Integer::intValue).toArray();
        int[] preOrderResult = preOrder(root, new ArrayList<>()).stream().mapToInt(Integer::intValue).toArray();

        assertArrayEquals(inOrder, inOrderResult);
        assertArrayEquals(preOrder, preOrderResult);

    }

    private List<Integer> inOrder(TreeNode root, List<Integer> nums) {
        if (root == null) {
            return nums;
        }
        inOrder(root.left, nums);
        nums.add(root.val);
        inOrder(root.right, nums);
        return nums;
    }

    private List<Integer> preOrder(TreeNode root, List<Integer> nums) {
        if (root == null) {
            return nums;
        }
        nums.add(root.val);
        preOrder(root.left, nums);
        preOrder(root.right, nums);
        return nums;
    }
}