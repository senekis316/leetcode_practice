package practice.leecode.Arrays;

public class SubArrayRanges_2104 {

    public long subArrayRanges(int[] nums) {
        int min;
        int max;
        long res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            min = max = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                res += max - min;
            }
        }
        return res;
    }

}
