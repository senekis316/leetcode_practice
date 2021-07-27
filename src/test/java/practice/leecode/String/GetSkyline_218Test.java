package practice.leecode.String;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GetSkyline_218Test {

    @Test
    public void getSkyline_1() {

        int[][] buildings = {{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
        int[][] expects = {{2,10},{3,15},{7,12},{12,0},{15,10},{20,8},{24,0}};

        GetSkyline_218 getSkyline_218 = new GetSkyline_218();
        List<List<Integer>> results = getSkyline_218.getSkyline(buildings);

        for (int i = 0; i < results.size(); i++) {
            assertEquals(results.get(i).get(0).intValue(), expects[i][0]);
            assertEquals(results.get(i).get(1).intValue(), expects[i][1]);
        }

    }

    @Test
    public void getSkyline_2() {

        int[][] buildings = {{0,2,3},{2,5,3}};
        int[][] expects = {{0,3},{5,0}};

        GetSkyline_218 getSkyline_218 = new GetSkyline_218();
        List<List<Integer>> results = getSkyline_218.getSkyline(buildings);

        for (int i = 0; i < results.size(); i++) {
            assertEquals(results.get(i).get(0).intValue(), expects[i][0]);
            assertEquals(results.get(i).get(1).intValue(), expects[i][1]);
        }

    }

    @Test
    public void getSkyline_3() {
        int[][] buildings = {{0,2147483647,2147483647}};
        int[][] expects = {{0,2147483647},{2147483647,0}};

        GetSkyline_218 getSkyline_218 = new GetSkyline_218();
        List<List<Integer>> results = getSkyline_218.getSkyline(buildings);

        for (int i = 0; i < results.size(); i++) {
            assertEquals(results.get(i).get(0).intValue(), expects[i][0]);
            assertEquals(results.get(i).get(1).intValue(), expects[i][1]);
        }

    }

    @Test
    public void getSkyline_4() {
        int[][] buildings = {{0,1,3}};
        int[][] expects = {{0,3},{1,0}};

        GetSkyline_218 getSkyline_218 = new GetSkyline_218();
        List<List<Integer>> results = getSkyline_218.getSkyline(buildings);

        for (int i = 0; i < results.size(); i++) {
            assertEquals(results.get(i).get(0).intValue(), expects[i][0]);
            assertEquals(results.get(i).get(1).intValue(), expects[i][1]);
        }

    }

}