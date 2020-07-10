package practice.leecode.Arrays;

public class SmallerNumbersThanCurrent_1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[101];
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums[i]; j++) {
                sum += counts[j];
            }
            nums[i] = sum;
        }
        return nums;
    }

}
