package practice.leecode.Tree;

import practice.utils.Node;

public class MaxDepth_559 {

    // 方式一
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children == null || root.children.size() == 0) {
            return 1;
        }
        int max = 0;
        for (int i = 0; i < root.children.size(); i++) {
            max = Math.max(max, maxDepth(root.children.get(i)));
        }
        return max + 1;
    }


    // 方式二
    /*int max = 0;

    public int maxDepth(Node root) {
        max = 0;
        if (root == null) {
            return max;
        }
        getMaxDepth(root, 1);
        return max;
    }

    private void getMaxDepth(Node root, int depth) {
        if (root == null) return;
        max = max < depth ? depth : max;
        if (root.children == null) return;
        for (int i = 0; i < root.children.size(); i++) {
            getMaxDepth(root.children.get(i), depth + 1);
        }
    }*/

}
