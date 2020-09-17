package practice.leecode.Tree;

import practice.utils.TreeNode;

import java.util.*;

/**
 * TODO 没有看懂官方题解
 */
public class CountPairs_1530 {

    private int ans;

    public int countPairs(TreeNode root, int distance) {
        dfs(root, distance);
        return ans;
    }

    private int[] dfs(TreeNode root, int dis) {
        if (null == root) return new int[dis + 1];
        int[] cnt = new int[dis + 1];
        if (root.left == null && root.right == null) {
            cnt[0] = 1;
            return cnt;
        }
        int[] left = dfs(root.left, dis);
        int[] right = dfs(root.right, dis);
        for (int i = 0; i < dis; i++) {
            for (int j = 0; i + j + 2 <= dis; j++) {
                ans += left[i] * right[j];
            }
        }
        for (int i = 1; i <= dis; i++) cnt[i] = left[i - 1] + right[i - 1];
        return cnt;
    }

}

//    方法2
//    private int ans;
//
//    public int countPairs(TreeNode root, int distance) {
//        dfs(root, distance);
//        return ans;
//    }
//
//    private int[] dfs(TreeNode root, int dis) {
//        if (null == root) return new int[dis + 1];
//        int[] cnt = new int[dis + 1];
//        if (root.left == null && root.right == null) {
//            cnt[0] = 1;
//            return cnt;
//        }
//        int[] left = dfs(root.left, dis);
//        int[] right = dfs(root.right, dis);
//        for (int i = 0; i < dis; i++) {
//            for (int j = 0; i + j + 2 <= dis; j++) {
//                ans += left[i] * right[j];
//            }
//        }
//        for (int i = 1; i <= dis; i++) cnt[i] = left[i - 1] + right[i - 1];
//        return cnt;
//    }


//    方法1
//    private List<DeepTreeNode> deepTreeNodes;
//
//    public int countPairs(TreeNode root, int distance) {
//        deepTreeNodes = new ArrayList<>();
//        dfs(root, new int[0]);
//        return countPairs(distance);
//    }
//
//    public int countPairs(int distance) {
//        int count = 0;
//        for (int i = 0; i < deepTreeNodes.size() - 1; i++) {
//            for (int j = i + 1; j < deepTreeNodes.size(); j++) {
//                int[] path1 = deepTreeNodes.get(i).path;
//                int[] path2 = deepTreeNodes.get(j).path;
//                int index = 0;
//                while (index < path1.length && index < path2.length) {
//                    if (path1[index] != path2[index]) {
//                        break;
//                    }
//                    index++;
//                }
//                if ((path1.length - index + path2.length - index) <= distance) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    private void dfs(TreeNode root, int[] path) {
//        if (root == null) {
//            return;
//        }
//        if (root.left == null && root.right == null) {
//            deepTreeNodes.add(new DeepTreeNode(root, path));
//            return;
//        }
//        if (root.left != null) {
//            int[] copy = new int[path.length + 1];
//            System.arraycopy(path, 0, copy, 0, path.length);
//            copy[path.length] = 0;
//            dfs(root.left, copy);
//        }
//        if (root.right != null) {
//            int[] copy = new int[path.length + 1];
//            System.arraycopy(path, 0, copy, 0, path.length);
//            copy[path.length] = 1;
//            dfs(root.right, copy);
//        }
//    }
//
//class DeepTreeNode {
//    private TreeNode node;
//    private int[] path;
//
//    public DeepTreeNode(TreeNode node, int[] path) {
//        this.node = node;
//        this.path = path;
//    }
//}


//    private int count;
//    private Set<DeepTreeNode> deepTreeNodeSet;
//    private Map<Integer, List<TreeNode>> treeNodeMap;
//
//    public int countPairs(TreeNode root, int distance) {
//        this.count = 0;
//        treeNodeMap = new HashMap<>();
//        deepTreeNodeSet = new HashSet<>();
//        dfs(root, 0);
//        for (DeepTreeNode deepTreeNode : deepTreeNodeSet) {
//            if (deepTreeNode.deep < distance) {
//                int target = distance - deepTreeNode.deep;
//                List<TreeNode> treeNodeList = treeNodeMap.get(target);
//                if (treeNodeList != null) {
//                    if (deepTreeNode.deep != target) {
//                        count += treeNodeList.size();
//                    } else {
//                        count += treeNodeList.size() - 1;
//                    }
//                }
//            }
//        }
//        return count / 2;
//    }
//
//    private void dfs(TreeNode root, int deep) {
//        if (root == null) {
//            return;
//        }
//        if (root.left == null && root.right == null) {
//            deepTreeNodeSet.add(new DeepTreeNode(root, deep));
//            List<TreeNode> treeNodeList = treeNodeMap.getOrDefault(deep, new ArrayList<>());
//            treeNodeList.add(root);
//            treeNodeMap.put(deep, treeNodeList);
//        }
//        dfs(root.left, deep + 1);
//        dfs(root.right, deep + 1);
//    }
//
//    class DeepTreeNode {
//        private Integer deep;
//        private TreeNode node;
//        public DeepTreeNode(TreeNode node, int deep) {
//            this.node = node;
//            this.deep = deep;
//        }
//    }


