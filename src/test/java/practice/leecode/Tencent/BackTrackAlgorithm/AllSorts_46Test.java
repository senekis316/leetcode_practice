package practice.leecode.Tencent.BackTrackAlgorithm;

import org.junit.Test;
import practice.utils.JacksonUtils;

import static org.junit.Assert.*;


public class AllSorts_46Test {

    @Test
    public void permute() {

        AllSorts_46 allSorts_46 = new AllSorts_46();

        int[] nums1 = new int[]{1,2,3};
        System.out.println(JacksonUtils.toJson(allSorts_46.permute(nums1)));
        assertEquals(6, allSorts_46.permute(nums1).size());

        int[] nums2 = new int[]{1,2,3,4};
        System.out.println(JacksonUtils.toJson(allSorts_46.permute(nums2)));
        assertEquals(24, allSorts_46.permute(nums2).size());

    }

}