package practice.leecode.Tencent.SortAndSearch;


public class KthSmallest {

    private int i;

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return 0;
        int smallest = kthSmallest(root.left, k);
        if (i == k) return smallest;
        if (++i == k) return root.val;
        return kthSmallest(root.right, k);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /*//中序遍历
    private int index;

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        int res = kthSmallest(root.left, k);
        if (index == k) {
            return res;
        }
        if (++index == k) {
            return root.val;
        }
        return kthSmallest(root.right, k);
    }*/

    //中序遍历
    /*public int kthSmallest(TreeNode root, int k) {
        return kthSmallest(root, k, 0);
    }

    public int kthSmallest(TreeNode root, int k, int i) {
        if (root == null) return 0;
        int smallest = kthSmallest(root.left, k);
        if (i == k) return smallest;
        if (++i == k) return root.val;
        return kthSmallest(root.right, k, i);
    }*/

    /*public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> treeNodeList = new LinkedList<>();
        while(root!=null) {
            if (root.right != null) treeNodeList.addFirst(root.right);
            treeNodeList.addFirst(root);
            if (root.left == null) break;
            root = root.left;
        }
        return treeNodeList.get(k-1).val;
    }*/

}
