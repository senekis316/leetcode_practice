package practice.leecode.GraphTheory;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EventualSafeNodes_802Test {

    @Test
    public void eventualSafeNodes_1() {
        // graph = [[1,2],[2,3],[5],[0],[5],[],[]]
        // [2,4,5,6]

        int[][] graph = new int[][]{{1,2},{2,3},{5},{0},{5},{},{}};
        int[] expect = new int[]{2,4,5,6};

        EventualSafeNodes_802 eventualSafeNodes_802 = new EventualSafeNodes_802();
        List<Integer> actual = eventualSafeNodes_802.eventualSafeNodes(graph);

        assertArrayEquals(expect, actual.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void eventualSafeNodes_2() {
        // graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]]
        // [4]

        int[][] graph = new int[][]{{1,2,3,4},{1,2},{3,4},{0,4},{}};
        int[] expect = new int[]{4};

        EventualSafeNodes_802 eventualSafeNodes_802 = new EventualSafeNodes_802();
        List<Integer> actual = eventualSafeNodes_802.eventualSafeNodes(graph);

        assertArrayEquals(expect, actual.stream().mapToInt(Integer::intValue).toArray());
    }

}