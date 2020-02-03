package practice.leecode.Tree;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import practice.utils.TreeNode;

public class BuildTree_106Test {

    @Test
    public void buildTree() {

        int[] inOrder = new int[]{9,3,15,20,7};
        int[] postOrder = new int[]{9,15,7,20,3};

        BuildTree_106 BuildTree_106 = new BuildTree_106();
        TreeNode root = BuildTree_106.buildTree(inOrder, postOrder);

        int[] inOrderResult = inOrder(root, new ArrayList<>()).stream().mapToInt(Integer::intValue).toArray();
        int[] postOrderResult = postOrder(root, new ArrayList<>()).stream().mapToInt(Integer::intValue).toArray();

        assertArrayEquals(inOrder, inOrderResult);
        assertArrayEquals(postOrder, postOrderResult);

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

    private List<Integer> postOrder(TreeNode root, List<Integer> nums) {
        if (root == null) {
            return nums;
        }
        postOrder(root.left, nums);
        postOrder(root.right, nums);
        nums.add(root.val);
        return nums;
    }

}