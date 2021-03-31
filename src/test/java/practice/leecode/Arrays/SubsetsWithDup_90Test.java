package practice.leecode.Arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SubsetsWithDup_90Test {

    @Test
    public void subsetsWithDup_1() {
        SubsetsWithDup_90 subsetsWithDup_90 = new SubsetsWithDup_90();
        List<List<Integer>> res = subsetsWithDup_90.subsetsWithDup(new int[]{1,2,2});

        assertEquals(0, res.get(0).size());

        assertEquals(1, res.get(1).size());
        assertEquals(1, res.get(1).get(0).intValue());

        assertEquals(2, res.get(2).size());
        assertEquals(1, res.get(2).get(0).intValue());
        assertEquals(2, res.get(2).get(1).intValue());

        assertEquals(3, res.get(3).size());
        assertEquals(1, res.get(3).get(0).intValue());
        assertEquals(2, res.get(3).get(1).intValue());
        assertEquals(2, res.get(3).get(2).intValue());

        assertEquals(1, res.get(4).size());
        assertEquals(2, res.get(4).get(0).intValue());

        assertEquals(2, res.get(5).size());
        assertEquals(2, res.get(5).get(0).intValue());
        assertEquals(2, res.get(5).get(1).intValue());

    }

    @Test
    public void subsetsWithDup_2() {
        SubsetsWithDup_90 subsetsWithDup_90 = new SubsetsWithDup_90();
        List<List<Integer>> res = subsetsWithDup_90.subsetsWithDup(new int[]{0});
        assertEquals(0, res.get(0).size());
        assertEquals(1, res.get(1).size());
        assertEquals(0, res.get(1).get(0).intValue());
    }

}