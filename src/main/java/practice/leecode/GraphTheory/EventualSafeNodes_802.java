package practice.leecode.GraphTheory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EventualSafeNodes_802 {

    public List<Integer> eventualSafeNodes(int[][] graph) {

        // 反图
        List<List<Integer>> reverse = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            reverse.add(new ArrayList<>());
        }
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                reverse.get(graph[i][j]).add(i);
            }
        }

        // 入度
        int[] indeg = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            indeg[i] = graph[i].length;
        }

        // 拓扑排序
        Queue<Integer> queue = new LinkedList<>();

        // 入度为0的节点入队
        for (int i = 0; i < graph.length; i++) {
            if (indeg[i] == 0) {
                queue.offer(i);
            }
        }

        // 裁剪入度
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int x : reverse.get(cur)) {
                indeg[x]--;
                if (indeg[x] == 0) {
                    queue.offer(x);
                }
            }
        }

        // 返回安全点
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if (indeg[i] == 0) res.add(i);
        }
        return res;

    }

}
