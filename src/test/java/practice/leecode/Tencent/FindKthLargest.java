package practice.leecode.qq;


import java.util.Arrays;

public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    /*public int findKthLargest(int[] nums, int k) {
        mergeSort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }

    private void mergeSort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }
    }

    private void merge(int[] nums, int start, int mid, int end) {

        int i = start;
        int j = mid + 1;
        int k = 0;
        int[] tmp = new int[end - start + 1];

        while(i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                tmp[k++] = nums[i++];
            } else {
                tmp[k++] = nums[j++];
            }
        }

        while(i <= mid) {
            tmp[k++] = nums[i++];
        }

        while(j < end) {
            tmp[k++] = nums[j++];
        }

        for (i = 0; i < k; i++) {
            nums[start + i] = tmp[i];
        }

    }*/

}
