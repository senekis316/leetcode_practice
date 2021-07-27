package practice.leecode.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class GetSkyline_218 {

    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> ans = new ArrayList<>();
        List<int[]> points = new ArrayList<>();
        for (int[] building : buildings) {
            points.add(new int[]{building[0], -building[2]});
            points.add(new int[]{building[1], building[2]});
        }
        Collections.sort(points, (p1, p2) -> p1[0] != p2[0] ? p1[0] - p2[0] : p1[1] - p2[1]);
        PriorityQueue<Integer> queue = new PriorityQueue<>((p1, p2) -> p2 - p1);
        queue.add(0);
        int prev = queue.peek();
        for (int[] point : points) {
            if (point[1] < 0) {
                queue.add(-point[1]);
            } else {
                queue.remove(point[1]);
            }
            int curr = queue.peek();
            if (curr != prev) {
                ans.add(List.of(point[0], curr));
                prev = curr;
            }
        }
        return ans;
    }

}
