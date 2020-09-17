package practice.leecode.Arrays;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ThreeSum_15Test {

    @Test
    public void threeSum_1() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        ThreeSum_15 threeSum_15 = new ThreeSum_15();
        List<List<Integer>> result = threeSum_15.threeSum(nums);
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(List.of(-1,0,1));
        expect.add(List.of(-1,-1,2));
        assertTrue(CollectionUtils.isEqualCollection(expect, result));
    }

    @Test
    public void threeSum_2() {
        int[] nums = new int[]{3,-2,1,0};
        ThreeSum_15 threeSum_15 = new ThreeSum_15();
        List<List<Integer>> result = threeSum_15.threeSum(nums);
        List<List<Integer>> expect = new ArrayList<>();
        assertTrue(CollectionUtils.isEqualCollection(expect, result));
    }

    @Test
    public void threeSum_3() {
        int[] nums = new int[]{1,-1,-1,0};
        ThreeSum_15 threeSum_15 = new ThreeSum_15();
        List<List<Integer>> result = threeSum_15.threeSum(nums);
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(List.of(-1,0,1));
        assertTrue(CollectionUtils.isEqualCollection(expect, result));
    }

}