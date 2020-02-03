package practice.leecode;

import org.junit.Test;
import practice.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreePaths_257Test {

    @Test
    public void binaryTreePaths1() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node1.right = node3;

        BinaryTreePaths_257 binaryTreePaths_257 = new BinaryTreePaths_257();
        List<String> binaryTreePaths = binaryTreePaths_257.binaryTreePaths(root);

        assertEquals("1->2->5", binaryTreePaths.get(0));
        assertEquals("1->3", binaryTreePaths.get(1));

    }

    //[37,-34,-48,null,-100,-100,48,null,null,null,null,-54,null,-71,-22,null,null,null,8]
    //["37->-34->-100","37->-48->-100","37->-48->48->-54->-71","37->-48->48->-54->-22->8"]
    //["37->-34->-100","37->-34->-48->-100","37->-34->-48->-->48->-54->-71","37->-34->-48->-->48->-54->->-22->8"]
    @Test
    public void binaryTreePaths2() {

        TreeNode root = new TreeNode(37);

        TreeNode node1 = new TreeNode(-34);
        TreeNode node2 = new TreeNode(-48);

        TreeNode node3 = new TreeNode(-100);
        TreeNode node4 = new TreeNode(-100);
        TreeNode node5 = new TreeNode(48);

        TreeNode node6 = new TreeNode(-54);

        TreeNode node7 = new TreeNode(-71);
        TreeNode node8 = new TreeNode(-22);

        TreeNode node9 = new TreeNode(8);


        root.left = node1;
        root.right = node2;

        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        node5.left = node6;

        node6.left = node7;
        node6.right = node8;

        node8.right = node9;

        BinaryTreePaths_257 binaryTreePaths_257 = new BinaryTreePaths_257();
        List<String> binaryTreePaths = binaryTreePaths_257.binaryTreePaths(root);

        assertArrayEquals(new String[]{"37->-34->-100","37->-48->-100","37->-48->48->-54->-71","37->-48->48->-54->-22->8"}, binaryTreePaths.toArray());

    }



}