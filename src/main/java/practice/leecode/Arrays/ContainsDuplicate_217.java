package practice.leecode.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integers = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            integers.add(nums[i]);
            if (integers.size() != i + 1) {
                return true;
            }
        }
        return false;
    }

}
