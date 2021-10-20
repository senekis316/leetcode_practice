package practice.leecode.Arrays;

public class MinMoves_453 {

    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i] - min;
        }
        return count;
    }

}
