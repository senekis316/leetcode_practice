package practice.leecode.GraphTheory;


import java.util.Arrays;

public class NetworkDelayTime_743 {

    public int networkDelayTime(int[][] times, int n, int k) {

        final int INF = Integer.MAX_VALUE / 2;

        // 邻接矩阵保存边长度信息
        int[][] borders = new int[n][n];
        for (int[] border : borders) {
            Arrays.fill(border, INF);
        }
        for (int[] time : times) {
            borders[time[0] - 1][time[1] - 1] = time[2];
        }

        // 源节点距离信息
        int[] distances = new int[n];
        Arrays.fill(distances, INF);
        distances[k - 1] = 0;

        // 节点是否已更新路径
        boolean[] used = new boolean[n];
        Arrays.fill(used, false);

        // 更新节点路径
        for (int i = 0; i < n; i++) {

            // 选取更新节点
            int x = -1;
            for (int y = 0; y < n; y++) {
                if (!used[y] && (x == -1 || distances[y] < distances[x])) {
                    x = y;
                }
            }

            // 更新节点路径
            used[x] = true;
            for (int y = 0; y < n; y++) {
                distances[y] = Math.min(distances[y] , distances[x] + borders[x][y]);
            }

        }

        // 返回最大距离
        int ans = -1;
        for (int distance : distances) {
            ans = Math.max(ans, distance);
        }
        return ans == INF ? -1 : ans;

    }










//    public int networkDelayTime(int[][] times, int n, int k) {
//
//        final int INF = Integer.MAX_VALUE / 2;
//
//        // 邻接矩阵存储边信息
//        int[][] paths = new int[n][n];
//        for (int[] path : paths) {
//            Arrays.fill(path, INF);
//        }
//        for (int[] time : times) {
//            paths[time[0] - 1][time[1] - 1] = time[2];
//        }
//
//        // 源点到终点的距离
//        int[] distances = new int[n];
//        Arrays.fill(distances, INF);
//        distances[k - 1] = 0;
//
//        // 初始化节点是否已更新最短距离
//        boolean[] used = new boolean[n];
//        Arrays.fill(used, false);
//
//        // 更新最小路径
//        for (int i = 0; i < n; i++) {
//
//            // 确定需要更新的节点
//            int x = -1;
//            for (int y = 0; y < n; y++) {
//                if (!used[y] && (x == -1 || distances[y] < distances[x])) {
//                    x = y;
//                }
//            }
//
//            // 根据节点更新距离
//            used[x] = true;
//            for (int y = 0; y < n; y++) {
//                distances[y] = Math.min(distances[y], distances[x] + paths[x][y]);
//            }
//
//        }
//
//        // 获取最大距离节点
//        int ans = -1;
//        for (int distance : distances) {
//            ans = Math.max(ans, distance);
//        }
//        return ans == INF ? -1 : ans;
//
//    }

}
