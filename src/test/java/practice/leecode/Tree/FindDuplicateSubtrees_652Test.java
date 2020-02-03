package practice.leecode.Tree;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import practice.utils.TreeNode;

public class FindDuplicateSubtrees_652Test {

    @Test
    public void findDuplicateSubtrees() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = node6;

        FindDuplicateSubtrees_652 FindDuplicateSubtrees_652 = new FindDuplicateSubtrees_652();
        List<TreeNode> nodes = FindDuplicateSubtrees_652.findDuplicateSubtrees(root);

        assertEquals(2, nodes.size());
        assertEquals(node3.val, nodes.get(0).val);
        assertEquals(node1.val, nodes.get(1).val);
    }

//    @Test
//    public void findDuplicateSubtrees() {
//        List<Integer> nums1 = new ArrayList<>();
//        List<Integer> nums2 = new ArrayList<>();
//        Map<List<Integer>, List<Integer>> map = new HashMap<>();
//        map.put(nums1, new ArrayList<>());
//        map.put(nums2, new ArrayList<>());
//        System.out.println(map.get(nums1) == map.get(nums2));
//    }
}