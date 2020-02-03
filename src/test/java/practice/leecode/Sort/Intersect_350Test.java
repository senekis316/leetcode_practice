package practice.leecode.Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class Intersect_350Test {

    @Test
    public void intersect_1() {
        int[] input1 = {1,2,2,1};
        int[] input2 = {2,2};
        int[] output = {2,2};
        Intersect_350 Intersect_350 = new Intersect_350();
        assertArrayEquals(output, Intersect_350.intersect(input1, input2));
    }

    @Test
    public void intersect_2() {
        int[] input1 = {1,2,2,1};
        int[] input2 = {2};
        int[] output = {2};
        Intersect_350 Intersect_350 = new Intersect_350();
        assertArrayEquals(output, Intersect_350.intersect(input1, input2));
    }

    @Test
    public void intersect_3() {
        int[] input1 = {4,9,5};
        int[] input2 = {9,4,9,8,4};
        int[] output = {9,4};
        Intersect_350 Intersect_350 = new Intersect_350();
        int[] res = Intersect_350.intersect(input1, input2);
        assertTrue(res[0] == 4 || res[0] == 9);
        assertTrue(res[1] == 4 || res[1] == 9);
    }

}