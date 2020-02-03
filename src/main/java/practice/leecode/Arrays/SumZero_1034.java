package practice.leecode.Arrays;

public class SumZero_1034 {

    public int[] sumZero(int n) {
        int sum = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n - 1; i++) {
            nums[i] = i;
            sum += i;
        }
        nums[n - 1] = -sum;
        return nums;
    }

}
