package practice.leecode.Tree;

import practice.utils.Node;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder_429 {

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        return levelOrderValueList(root, 1, new ArrayList<>());
    }

    private List<List<Integer>> levelOrderValueList(Node root, int level, List<List<Integer>> orderValueList) {
        if (root == null) {
            return orderValueList;
        }
        if (orderValueList.size() < level) {
            orderValueList.add(new ArrayList<>());
        }
        orderValueList.get(level - 1).add(root.val);
        if (root.children != null) {
            for (int i = 0; i < root.children.size(); i++) {
                levelOrderValueList(root.children.get(i), level + 1, orderValueList);
            }
        }
        return orderValueList;
    }



}
