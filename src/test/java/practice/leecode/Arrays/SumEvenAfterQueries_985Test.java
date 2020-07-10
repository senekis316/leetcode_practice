package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumEvenAfterQueries_985Test {

    @Test
    public void sumEvenAfterQueries_1() {
        int[] A = new int[]{1,2,3,4};
        int[][] queries = new int[][]{{1,0},{-3,1},{-4,0},{2,3}};
        SumEvenAfterQueries_985 SumEvenAfterQueries_985 = new SumEvenAfterQueries_985();
        assertArrayEquals(new int[]{8,6,2,4}, SumEvenAfterQueries_985.sumEvenAfterQueries(A, queries));
    }

    @Test
    public void sumEvenAfterQueries_2() {
        int[] A = new int[]{1};
        int[][] queries = new int[][]{{4,0}};
        SumEvenAfterQueries_985 SumEvenAfterQueries_985 = new SumEvenAfterQueries_985();
        assertArrayEquals(new int[]{0}, SumEvenAfterQueries_985.sumEvenAfterQueries(A, queries));
    }
}