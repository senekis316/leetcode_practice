package practice.leecode.Tree;

import practice.utils.TreeNode;


public class SubtreeWithAllDeepest_865 {

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }

    public Result dfs(TreeNode root) {
        if (root == null) {
            return new Result(null,0);
        }
        Result L = dfs(root.left), R = dfs(root.right);
        if (L.dist > R.dist) return new Result(L.node, L.dist + 1);
        if (L.dist < R.dist) return new Result(R.node, R.dist + 1);
        return new Result(root, L.dist + 1);
    }

    class Result {
        private int dist;
        private TreeNode node;
        public Result(TreeNode node, int dist) {
            this.dist = dist;
            this.node = node;
        }
    }

}






