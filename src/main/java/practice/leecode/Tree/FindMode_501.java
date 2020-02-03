package practice.leecode.Tree;

import practice.utils.TreeNode;

import java.util.*;

public class FindMode_501 {

    int pre;
    int cur;
    int max;
    List<Integer> list;

    public int[] findMode(TreeNode root) {
        cur = 0;
        max = 0;
        pre = -1;
        list = new ArrayList<>();
        inOrder(root);
        int[] a = new int[list.size()];
        for(int i=0;i<list.size();i++){
            a[i] = list.get(i);
        }
        return a;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        cur = pre == root.val ? cur + 1 : 1;
        if (max == cur) {
            list.add(root.val);
        }
        if (max < cur) {
            list = new ArrayList<>();
            list.add(root.val);
            max = cur;
        }
        pre = pre != root.val ? root.val : pre;
        inOrder(root.right);
    }



    //方法1
    /*public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Map<Integer, Integer> modeMap = new HashMap<>();
        findMode(root, modeMap);
        return getMode(modeMap);
    }

    private void findMode(TreeNode root, Map<Integer, Integer> modeMap) {
        if (root == null) {
            return;
        }
        addTimeNodeTimes(root, modeMap);
        findMode(root.left, modeMap);
        findMode(root.right, modeMap);
    }

    private void addTimeNodeTimes(TreeNode root, Map<Integer, Integer> modeMap) {
        Integer times = modeMap.get(root.val);
        if (times == null) {
            modeMap.put(root.val, 1);
        } else {
            modeMap.put(root.val, times + 1);
        }
    }

    private int[] getMode(Map<Integer, Integer> modeMap) {
        List<Integer> modes = new ArrayList<>();
        int maxTimes = 0;
        for (Map.Entry<Integer,Integer> entry : modeMap.entrySet()) {
            Integer times = entry.getValue();
            maxTimes = maxTimes < times ? times : maxTimes;
        }
        for (Map.Entry<Integer,Integer> entry : modeMap.entrySet()) {
            if (entry.getValue() == maxTimes) {
                modes.add(entry.getKey());
            }
            Integer times = entry.getValue();
            maxTimes = maxTimes < times ? times : maxTimes;
        }
        return modes.stream().mapToInt(i -> i).toArray();
    }

    private static class TimeNode {

        private int times;

        private int value;

        TimeNode(int times, int value) {
            this.times = times;
            this.value = value;
        }

        public int getTimes() {
            return times;
        }

        public void setTimes(int times) {
            this.times = times;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

    }*/


    //方法2: 利用二叉搜索树的中序遍历结果是一个升序数组
    /*int pre;
    int cur;
    int max;
    List<Integer> list;

    public int[] findMode(TreeNode root) {
        cur = 0;
        max = 0;
        pre = -1;
        inOrder(root);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        cur = pre == root.val ? cur + 1 : 1;
        if (cur == max) {
            list.add(root.val);
        }
        if (cur > max) {
            list = new ArrayList<>();
            list.add(root.val);
            max = cur;
        }
        pre = root.val;
        inOrder(root.right);
    }*/
}
