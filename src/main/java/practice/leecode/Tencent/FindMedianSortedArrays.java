package practice.leecode.qq;

import practice.utils.JacksonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int[] nums = new int[nums1.length + nums2.length];
        int i = 0, j = 0, z = 0;

        while (i < nums1.length || j < nums2.length) {

            if (i < nums1.length && j >= nums2.length) {
                nums[z] = nums1[i];
                i++;
            } else if (i >= nums1.length && j < nums2.length) {
                nums[z] = nums2[j];
                j++;
            } else {
                if (nums1[i] < nums2[j]) {
                    nums[z] = nums1[i];
                    i++;
                } else {
                    nums[z] = nums2[j];
                    j++;
                }
            }

            z++;
        }

        int middle = nums.length / 2;
        if (nums.length % 2 == 1) {
            return nums[middle];
        } else {
            double num1 = nums[middle-1];
            double num2 = nums[middle];
            return (num1 + num2) / 2;
        }

        /*List<Integer> list1 = IntStream.of(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = IntStream.of(nums2).boxed().collect(Collectors.toList());
        list1.addAll(list2);

        list1 = list1.stream().sorted().collect(Collectors.toList());

        int middle = list1.size() / 2;
        if ( list1.size() % 2 == 1) {
            return list1.get(middle);
        } else {
            double num1 = list1.get(middle-1);
            double num2 = list1.get(middle);
            return (num1 + num2) / 2;
        }*/
    }

}
