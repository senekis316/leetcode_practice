package practice.leecode.Arrays;

import java.util.TreeSet;

public class ContainsNearbyAlmostDuplicate_220 {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && ceiling <= (long) nums[i] + (long) t) {
                return true;
            }
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }

//    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
//                if (Math.abs((long)nums[i] - (long)nums[j]) <= t) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

}
