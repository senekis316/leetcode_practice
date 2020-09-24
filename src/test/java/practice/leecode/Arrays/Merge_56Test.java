package practice.leecode.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class Merge_56Test {

    @Test
    public void merge_1() {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] expect = {{1,6},{8,10},{15,18}};
        Merge_56 merge_56 = new Merge_56();
        int[][] actual = merge_56.merge(intervals);
        assertArrayEquals(expect, actual);
    }

    @Test
    public void merge_2() {
        int[][] intervals = {{1,3}};
        int[][] expect = {{1,3}};
        Merge_56 merge_56 = new Merge_56();
        int[][] actual = merge_56.merge(intervals);
        assertArrayEquals(expect, actual);
    }

    @Test
    public void merge_3() {
        int[][] intervals = {{1,4},{5,6}};
        int[][] expect = {{1,4},{5,6}};
        Merge_56 merge_56 = new Merge_56();
        int[][] actual = merge_56.merge(intervals);
        assertArrayEquals(expect, actual);
    }

    @Test
    public void merge_4() {
        int[][] intervals = {{1,4},{0,0}};
        int[][] expect = {{0,0},{1,4}};
        Merge_56 merge_56 = new Merge_56();
        int[][] actual = merge_56.merge(intervals);
        assertArrayEquals(expect, actual);
    }

    @Test
    public void merge_5() {
        int[][] intervals = {{4,5},{1,4},{0,1}};
        int[][] expect = {{0,5}};
        Merge_56 merge_56 = new Merge_56();
        int[][] actual = merge_56.merge(intervals);
        assertArrayEquals(expect, actual);
    }

}