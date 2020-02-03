package practice.leecode.Sort;

public class SortedSquares_977 {

    public int[] sortedSquares(int[] nums) {
        int pos = nums.length - 1;
        int[] res = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        while(i <= j) {
            int num1 = nums[i] * nums[i];
            int num2 = nums[j] * nums[j];
            if (num1 > num2) {
                res[pos--] = num1;
                i++;
            } else {
                res[pos--] = num2;
                j--;
            }
        }
        return res;
    }

    /*public int[] sortedSquares(int[] nums) {
        int center = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                center = i;
                break;
            }
        }
        int i = center - 1;
        int j = center;
        int pos = 0;
        int[] res = new int[nums.length];
        while(i >= 0 && j < nums.length) {
            if (Math.abs(nums[i]) == nums[j]) {
                res[pos++] = nums[i] * nums[i--];
                res[pos++] = nums[j] * nums[j++];
            } else if (Math.abs(nums[i]) < nums[j]) {
                res[pos++] = nums[i] * nums[i--];
            } else {
                res[pos++] = nums[j] * nums[j++];
            }
        }
        while(i >= 0) {
            res[pos++] = nums[i] * nums[i--];
        }
        while (j < nums.length) {
            res[pos++] = nums[j] * nums[j++];
        }
        return res;
    }*/

    /*public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }*/

}
