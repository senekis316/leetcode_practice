package practice.leecode.Arrays;

public class FindUnsortedSubarray_581 {

    public int findUnsortedSubarray(int[] nums) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for(int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                min = nums[i];
                break;
            }
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                max = nums[i];
                break;
            }
        }

        if (min == Integer.MIN_VALUE) {
            return 0;
        }

        if (max == Integer.MAX_VALUE) {
            return nums.length - min;
        }

        return max - min + 1;

    }

    /*public int findUnsortedSubarray(int[] nums) {

        int[] nums1 = nums;
        int[] nums2 = new int[nums.length];
        System.arraycopy(nums1, 0,  nums2, 0, nums.length);

        quick_sort(nums2, 0, nums.length - 1);

        int start = -1;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (start == -1 && nums1[i] != nums2[i]) {
                start = i;
            }
            if (start != -1 && nums1[i] != nums2[i]) {
                end = i;
            }
        }

        return start == -1 ? 0 : end - start + 1;

    }

    private void quick_sort(int[] nums, int l, int r) {

        if (l < r) {

            int i = l, j = r;
            int m = nums[l];

            while(i < j) {

                while(i < j && nums[j] >= m) {
                    j--;
                }

                if (i < j) {
                    nums[i++] = nums[j];
                }

                while(i < j && nums[i] < m) {
                    i++;
                }

                if (i < j) {
                    nums[j--] = nums[i];
                }

            }

            nums[i] = m;

            quick_sort(nums, l, i - 1);
            quick_sort(nums, i + 1, r);

        }

    }*/

}
