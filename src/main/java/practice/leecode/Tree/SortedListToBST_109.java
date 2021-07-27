package practice.leecode.Tree;

import practice.utils.ListNode;
import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SortedListToBST_109 {

    // 给定的有序链表： [-10, -3, 0, 5, 9],
    // 一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return sortedListToBST(list, 0, list.size() - 1);
    }

    private TreeNode sortedListToBST(List<Integer> list, int l, int r) {
        if (l > r) {
            return null;
        }
        if (l == r) {
            return new TreeNode(list.get(l));
        }
        int center = getCenter(l, r);
        TreeNode root = new TreeNode(list.get(center));
        root.left = sortedListToBST(list, l, center - 1);
        root.right = sortedListToBST(list, center + 1, r);
        return root;
    }

    private int getCenter(int l, int r) {
        int size = r - l;
        return l + size / 2 + (size & 0b1);
    }

}
