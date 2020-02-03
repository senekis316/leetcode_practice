package practice.leecode.Tree;

import practice.leecode.Common.Node;

public class Connect_116 {

    public Node connect(Node root) {
        if (root == null || root.left == null) {
            return root;
        }
        root.left.next = root.right;
        if (root.next != null) {
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }

    //方法一: 哈希表
    /*Map<Integer, List<Node>> nodeMap;

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        nodeMap = new HashMap<>();
        connect(root, 0);
        connect();
        return root;
    }

    private void connect(Node root, int level) {
        if (root == null) {
            return;
        }
        List<Node> nodes = nodeMap.getOrDefault(level, new ArrayList<>());
        nodes.add(root);
        nodeMap.put(level, nodes);
        connect(root.left, level + 1);
        connect(root.right, level + 1);
    }

    private void connect() {
        for (Map.Entry<Integer, List<Node>> entry : nodeMap.entrySet()) {
            List<Node> nodes = entry.getValue();
            for (int i = 0; i < nodes.size() - 1; i++) {
                nodes.get(i).next = nodes.get(i + 1);
            }
        }
    }*/

}
