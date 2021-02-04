package practice.leecode.Arrays;


public class MedianSlidingWindow_480 {

    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] doubles = new double[nums.length - k + 1];
        int[] subArr = new int[k];
        for (int i = 0; i < doubles.length; i++) {
            if (i == 0) {
                System.arraycopy(nums, i, subArr, 0, k);
                quick_sort(subArr, 0, k - 1);
            } else {
                int subIdx = biSearch(subArr, nums[i - 1]);
                int addIdx = biSearch(subArr, nums[i + k - 1], subIdx);
                if (subIdx < addIdx) {
                    System.arraycopy(subArr, subIdx + 1, subArr, subIdx, addIdx - subIdx);
                } else if (subIdx > addIdx){
                    System.arraycopy(subArr, addIdx, subArr, addIdx + 1, subIdx - addIdx);
                }
                subArr[addIdx] = nums[i + k - 1];
            }
            doubles[i] = mediumNum(subArr);
        }
        return doubles;
    }

    private int biSearch(int[] arr, int target, int ignore) {
        int addIdx = biSearch(arr, target);
        return addIdx > ignore ? addIdx - 1 : addIdx;
    }

    private int biSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return left;
    }

    private double mediumNum(int[] nums) {
        int m = nums.length / 2;
        if (nums.length % 2 == 0) {
            return (nums[m - 1] * 1.0 + nums[m] * 1.0) / 2.0;
        } else {
            return nums[m] / 1.0;
        }
    }

    private void quick_sort(int[] nums, int l, int r) {
        if (l < r) {
            int i = l, j = r;
            int m = nums[l];
            while (i < j) {
                while (i < j && m <= nums[j]) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while (i < j && m > nums[i]) {
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
    }

}
