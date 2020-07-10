package practice.leecode.Arrays;

public class DuplicateZeros_1089 {

    public int[] duplicateZeros(int[] arr) {
        int j = 0;
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (j < nums.length) {
                nums[j++] = num;
            }
            if (arr[i] == 0 && j < nums.length - 1) {
                nums[j + 1] = 0;
            }
        }
        return nums;
    }

}
