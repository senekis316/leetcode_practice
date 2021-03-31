package practice.leecode.Arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Subsets_78Test {

    @Test
    public void subsets_1() {

        List<List<Integer>> expect = new ArrayList<>();
        expect.add(List.of());
        expect.add(List.of(1));
        expect.add(List.of(2));
        expect.add(List.of(1,2));
        expect.add(List.of(3));
        expect.add(List.of(1,3));
        expect.add(List.of(2,3));
        expect.add(List.of(1,2,3));

        Subsets_78 subsets_78 = new Subsets_78();
        assertEquals(expect, subsets_78.subsets(new int[]{1,2,3}));
    }

    @Test
    public void subsets_2() {
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(List.of());
        expect.add(List.of(0));

        Subsets_78 subsets_78 = new Subsets_78();
        assertEquals(expect, subsets_78.subsets(new int[]{0}));
    }

}