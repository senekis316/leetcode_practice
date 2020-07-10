package practice.leecode.Sort;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;

public class MinSubsequence_1403Test {

    @Test
    public void minSubsequence_1() {
        MinSubsequence_1403 minSubsequence_1403 = new MinSubsequence_1403();
        List<Integer> result = minSubsequence_1403.minSubsequence(new int[]{4,3,10,9,8});
        assertEquals(10, result.get(0).intValue());
        assertEquals(9, result.get(1).intValue());
    }

    @Test
    public void minSubsequence_2() {
        MinSubsequence_1403 minSubsequence_1403 = new MinSubsequence_1403();
        List<Integer> result = minSubsequence_1403.minSubsequence(new int[]{4,4,7,6,7});
        assertEquals(7, result.get(0).intValue());
        assertEquals(7, result.get(1).intValue());
        assertEquals(6, result.get(2).intValue());
    }

    @Test
    public void minSubsequence_3() {
        MinSubsequence_1403 minSubsequence_1403 = new MinSubsequence_1403();
        List<Integer> result = minSubsequence_1403.minSubsequence(new int[]{6});
        assertEquals(6, result.get(0).intValue());
    }

}