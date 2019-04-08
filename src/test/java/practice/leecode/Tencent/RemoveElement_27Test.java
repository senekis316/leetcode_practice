package practice.leecode.Tencent;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElement_27Test {

    @Test
    public void removeElement() {

        RemoveElement_27 removeElement_27 = new RemoveElement_27();

        int[] nums1 = new int[]{1,2,3};
        assertEquals(2, removeElement_27.removeElement(nums1, 3));

        int[] nums2 = new int[]{1,2,3,4};
        assertEquals(3, removeElement_27.removeElement(nums2, 3));

        int[] nums3 = new int[]{1,2,3,3,6,3};
        assertEquals(3, removeElement_27.removeElement(nums3, 3));

        int [] nums4 = new int[]{0,1,2,2,3,0,4,2};
        assertEquals(5, removeElement_27.removeElement(nums4, 2));

    }
}