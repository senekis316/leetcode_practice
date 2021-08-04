package practice.leecode.Arrays;

import java.util.Arrays;

public class TriangleNumber_611 {

    // 2.排序 + 二分查找
    public int triangleNumber(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int limit = nums[i] + nums[j];
                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    int mid = l + r + 1 >>> 1;
                    if (nums[mid] < limit) l = mid;
                    else r = mid - 1;
                }
                if (nums[r] < limit) ans += r - j;
            }
        }
        return ans;
    }

    // 1.排序 + 暴力法
//    public int triangleNumber(int[] nums) {
//        Arrays.sort(nums);
//        int ans = 0;
//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int j = i + 1; j < nums.length - 1; j++) {
//                for (int z = j + 1; z < nums.length; z++) {
//                    if (nums[z] < nums[i] + nums[j]) {
//                        ans++;
//                    }
//                }
//            }
//        }
//        return ans;
//    }

}
