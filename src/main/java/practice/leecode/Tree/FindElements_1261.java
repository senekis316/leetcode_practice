package practice.leecode.Tree;

import java.util.HashSet;
import java.util.Set;
import practice.utils.TreeNode;

public class FindElements_1261 {

    private Set<Integer> values;

    public FindElements_1261(TreeNode root) {
        this.values = new HashSet<>();
        repairElements(root, 0);
    }

    public boolean find(int target) {
        return values.contains(target);
    }

    private void repairElements(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        values.add(val);
        int num = val << 1;
        repairElements(root.left, num + 1);
        repairElements(root.right, num + 2);
    }

}
