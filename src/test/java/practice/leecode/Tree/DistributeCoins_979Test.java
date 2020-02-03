package practice.leecode.Tree;

import static org.junit.Assert.*;

import org.junit.Test;
import practice.utils.TreeNode;

public class DistributeCoins_979Test {

    @Test
    public void distributeCoins_1() {

        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(0);
        TreeNode right = new TreeNode(0);

        root.left = left;
        root.right = right;

        DistributeCoins_979 distributeCoins_979 = new DistributeCoins_979();
        assertEquals(2, distributeCoins_979.distributeCoins(root));

    }

    @Test
    public void distributeCoins_2() {

        TreeNode root = new TreeNode(0);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(0);

        root.left = left;
        root.right = right;

        DistributeCoins_979 distributeCoins_979 = new DistributeCoins_979();
        assertEquals(3, distributeCoins_979.distributeCoins(root));

    }

    @Test
    public void distributeCoins_3() {

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(0);
        TreeNode right = new TreeNode(2);

        root.left = left;
        root.right = right;

        DistributeCoins_979 distributeCoins_979 = new DistributeCoins_979();
        assertEquals(2, distributeCoins_979.distributeCoins(root));

    }

}