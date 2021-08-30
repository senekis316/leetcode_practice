package practice.leecode.Dynamic;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AllPathsSourceTarget_797Test {

    @Test
    public void allPathsSourceTarget_1() {
        int[][] graph = new int[][]{{1,2},{3},{3},{}};
        AllPathsSourceTarget_797 allPathsSourceTarget_797 = new AllPathsSourceTarget_797();
        List<List<Integer>> expect = allPathsSourceTarget_797.allPathsSourceTarget(graph);
        assertEquals(2, expect.size());
        assertArrayEquals(new int[]{0,1,3}, expect.get(0).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{0,2,3}, expect.get(1).stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void allPathsSourceTarget_2() {
        int[][] graph = new int[][]{{4,3,1},{3,2,4},{3},{4},{}};
        AllPathsSourceTarget_797 allPathsSourceTarget_797 = new AllPathsSourceTarget_797();
        List<List<Integer>> expect = allPathsSourceTarget_797.allPathsSourceTarget(graph);
        assertEquals(5, expect.size());
        assertArrayEquals(new int[]{0,4}, expect.get(0).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{0,3,4}, expect.get(1).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{0,1,3,4}, expect.get(2).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{0,1,2,3,4}, expect.get(3).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{0,1,4}, expect.get(4).stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void allPathsSourceTarget_3() {
        int[][] graph = new int[][]{{1},{}};
        AllPathsSourceTarget_797 allPathsSourceTarget_797 = new AllPathsSourceTarget_797();
        List<List<Integer>> expect = allPathsSourceTarget_797.allPathsSourceTarget(graph);
        assertEquals(1, expect.size());
        assertArrayEquals(new int[]{0,1}, expect.get(0).stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void allPathsSourceTarget_4() {
        int[][] graph = new int[][]{{1,2,3},{2},{3},{}};
        AllPathsSourceTarget_797 allPathsSourceTarget_797 = new AllPathsSourceTarget_797();
        List<List<Integer>> expect = allPathsSourceTarget_797.allPathsSourceTarget(graph);
        assertEquals(3, expect.size());
        assertArrayEquals(new int[]{0,1,2,3}, expect.get(0).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{0,2,3}, expect.get(1).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{0,3}, expect.get(2).stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void allPathsSourceTarget_5() {
        int[][] graph = new int[][]{{1,3},{2},{3},{}};
        AllPathsSourceTarget_797 allPathsSourceTarget_797 = new AllPathsSourceTarget_797();
        List<List<Integer>> expect = allPathsSourceTarget_797.allPathsSourceTarget(graph);
        assertEquals(2, expect.size());
        assertArrayEquals(new int[]{0,1,2,3}, expect.get(0).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{0,3}, expect.get(1).stream().mapToInt(Integer::intValue).toArray());
    }

}