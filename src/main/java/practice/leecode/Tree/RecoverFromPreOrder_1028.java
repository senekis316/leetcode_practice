package practice.leecode.Tree;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;
import lombok.Data;
import practice.utils.TreeNode;

public class RecoverFromPreOrder_1028 {

//    public TreeNode recoverFromPreOrder(String s) {
//        List<LevelNode> levelNodes = getLevelNodes(s);
//        TreeNode root = new TreeNode(levelNodes.get(0).getValue());
//
//        return null;
//    }
//
//    private List<LevelNode> getLevelNodes(String s) {
//        List<LevelNode> levelNodes = new ArrayList<>();
//        int index = 0;
//        while (index < s.length() - 1) {
//            int level = 0;
//            char[] chars = s.toCharArray();
//            for (int i = index; i < chars.length; i++) {
//                if (chars[i] == '-') {
//                    level++;
//                } else {
//                    index = i;
//                    break;
//                }
//            }
//
//            StringBuilder sb = new StringBuilder();
//            for (int i = index; i < chars.length; i++) {
//                if (chars[i] >= '0' && chars[i] <= '9') {
//                    sb.append(chars[i]);
//                } else {
//                    index = i;
//                    break;
//                }
//            }
//            int num = Integer.valueOf(sb.toString());
//            levelNodes.add(new LevelNode(num, level));
//        }
//        return levelNodes;
//    }
//
//    @Data
//    public static class LevelNode {
//        private int value;
//        private int level;
//        public LevelNode(int value, int level) {
//            this.value = value;
//            this.level = level;
//        }
//    }
//
//    public TreeNode recoverFromPreOrder(TreeNode root, List<LevelNode> nodes) {
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        for (int i = 1; i < nodes.size(); i++) {
//            LevelNode prev = nodes.get(i - 1);
//            LevelNode curr = nodes.get(i);
//            if (curr.getLevel() >= prev.getLevel()) {
//                TreeNode currNode = new TreeNode(curr.getValue());
//                TreeNode prevNode = stack.pop();
//                if (prevNode.left == null) {
//                    prevNode.left = currNode;
//                } else {
//                    prevNode.right = currNode;
//                }
//                stack.push(prevNode);
//            } else {
//                for ()
//            }
//        }
//        return root;
//    }

}
