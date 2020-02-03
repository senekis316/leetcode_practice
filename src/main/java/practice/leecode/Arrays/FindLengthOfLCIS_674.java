package practice.leecode.Arrays;

public class FindLengthOfLCIS_674 {

    private int max = 0;

    public int findLengthOfLCIS(int[] nums) {
        int max = 0, win = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] >= nums[i]) win = i;
            max = Math.max(max, i - win + 1);
        }
        return max;
    }

}
