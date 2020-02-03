package practice.leecode.Tree;

import java.util.HashMap;
import java.util.Map;
import practice.utils.TreeNode;

public class BuildTree_105 {

    private int preIndex;
    private int[] preOrder;
    private Map<Integer, Integer> inOrderMap;

    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        this.preIndex = 0;
        this.preOrder = preOrder;
        inOrderMap = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            inOrderMap.put(inOrder[i], i);
        }
        return buildTree(0, inOrder.length);
    }

    private TreeNode buildTree(int left, int right) {
        if (left == right) return null;
        int value = preOrder[preIndex++];
        int index = inOrderMap.get(value);
        TreeNode root = new TreeNode(value);
        root.left = buildTree(left, index);
        root.right = buildTree(index + 1, right);
        return root;
    }




}
