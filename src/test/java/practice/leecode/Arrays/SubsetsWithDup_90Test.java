package practice.leecode.Arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SubsetsWithDup_90Test {

    @Test
    public void subsetsWithDup_1() {

        List<List<Integer>> expect = new ArrayList<>();
        expect.add(List.of());
        expect.add(List.of(1));
        expect.add(List.of(2));
        expect.add(List.of(1,2));
        expect.add(List.of(2,2));
        expect.add(List.of(1,2,2));

        SubsetsWithDup_90 subsetsWithDup_90 = new SubsetsWithDup_90();
        List<List<Integer>> result = subsetsWithDup_90.subsetsWithDup(new int[]{1,2,2});

        assertEquals(expect, result);

    }

    @Test
    public void subsetsWithDup_2() {

        List<List<Integer>> expect = new ArrayList<>();
        expect.add(List.of());
        expect.add(List.of(0));

        SubsetsWithDup_90 subsetsWithDup_90 = new SubsetsWithDup_90();
        List<List<Integer>> result = subsetsWithDup_90.subsetsWithDup(new int[]{0});
        assertEquals(expect, result);

    }

}