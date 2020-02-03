package practice.leecode.Tree;

import java.util.HashMap;
import java.util.Map;
import practice.utils.TreeNode;

public class BuildTree_106 {

    private int postIndex;
    private int[] postOrder;
    private Map<Integer, Integer> inOrderMap;

    public TreeNode buildTree(int[] inOrder, int[] postOrder) {
        this.postOrder = postOrder;
        this.postIndex = postOrder.length - 1;
        inOrderMap = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            inOrderMap.put(inOrder[i], i);
        }
        return buildTree(0, postOrder.length);
    }

    private TreeNode buildTree(int left, int right) {
        if (left == right) return null;
        int value = postOrder[postIndex--];
        int index = inOrderMap.get(value);
        TreeNode root = new TreeNode(value);
        root.right = buildTree(index + 1, right);
        root.left = buildTree(left, index);
        return root;
    }

}
