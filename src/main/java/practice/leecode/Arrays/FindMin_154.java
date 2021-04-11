package practice.leecode.Arrays;

public class FindMin_154 {

    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] < nums[r]) {
                r = m;
            } else if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r--;
            }
        }
        return nums[l];
    }

//    public int findMin(int[] nums) {
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i - 1] > nums[i]) {
//                return nums[i];
//            }
//        }
//        return nums[0];
//    }

}
