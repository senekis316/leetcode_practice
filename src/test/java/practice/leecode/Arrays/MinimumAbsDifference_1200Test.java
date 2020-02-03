package practice.leecode.Arrays;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;

public class MinimumAbsDifference_1200Test {

    @Test
    public void minimumAbsDifference_1() {
        int[] input = {4,2,1,3};
        MinimumAbsDifference_1200 MinimumAbsDifference_1200 = new MinimumAbsDifference_1200();
        List<List<Integer>> res = MinimumAbsDifference_1200.minimumAbsDifference(input);
        assertEquals(3, res.size());
        assertEquals(1, res.get(0).get(0).intValue());
        assertEquals(2, res.get(0).get(1).intValue());
        assertEquals(2, res.get(1).get(0).intValue());
        assertEquals(3, res.get(1).get(1).intValue());
        assertEquals(3, res.get(2).get(0).intValue());
        assertEquals(4, res.get(2).get(1).intValue());
    }

    @Test
    public void minimumAbsDifference_2() {
        int[] input = {1,3,6,10,15};
        MinimumAbsDifference_1200 MinimumAbsDifference_1200 = new MinimumAbsDifference_1200();
        List<List<Integer>> res = MinimumAbsDifference_1200.minimumAbsDifference(input);
        assertEquals(1, res.size());
        assertEquals(1, res.get(0).get(0).intValue());
        assertEquals(3, res.get(0).get(1).intValue());
    }

    @Test
    public void minimumAbsDifference_3() {
        int[] input = {3,8,-10,23,19,-4,-14,27};
        MinimumAbsDifference_1200 MinimumAbsDifference_1200 = new MinimumAbsDifference_1200();
        List<List<Integer>> res = MinimumAbsDifference_1200.minimumAbsDifference(input);
        assertEquals(3, res.size());
        assertEquals(-14, res.get(0).get(0).intValue());
        assertEquals(-10, res.get(0).get(1).intValue());
        assertEquals(19, res.get(1).get(0).intValue());
        assertEquals(23, res.get(1).get(1).intValue());
        assertEquals(23, res.get(2).get(0).intValue());
        assertEquals(27, res.get(2).get(1).intValue());
    }
}