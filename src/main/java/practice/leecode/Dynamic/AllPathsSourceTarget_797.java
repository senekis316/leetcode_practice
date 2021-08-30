package practice.leecode.Dynamic;

import java.util.ArrayList;
import java.util.List;


public class AllPathsSourceTarget_797 {

    private List<List<Integer>> paths = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        allPathsSourceTarget(0, graph, new ArrayList<>());
        return paths;
    }

    private void allPathsSourceTarget(int n, int[][] graph, List<Integer> temp) {
        temp.add(n);
        if (n == graph.length - 1) {
            paths.add(new ArrayList<>(temp));
        }
        for (int i = 0; i < graph[n].length; i++) {
            allPathsSourceTarget(graph[n][i], graph, temp);
        }
        temp.remove(temp.size() - 1);
    }

}
