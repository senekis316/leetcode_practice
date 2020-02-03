package practice.leecode.Arrays;

public class SortArrayByParity_905 {


    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            if (nums[i] % 2 == 1 && nums[j] % 2 == 0) {
                nums[i] = nums[i] ^ nums[j];
                nums[j] = nums[i] ^ nums[j];
                nums[i] = nums[i] ^ nums[j];
                i++;
                j--;
                continue;
            } else {
                if (nums[i] % 2 == 0) {
                    i++;
                }
                if (nums[j] % 2 == 1) {
                    j--;
                }
            }
        }
        return nums;
    }

    /*public int[] sortArrayByParity(int[] nums) {
        int even = 0;
        for (int odd = 0; odd < nums.length; odd++) {
            if (nums[odd] % 2 == 1) {
                if (even <= odd + 1) {
                    even = odd + 1;
                }
                while(even < nums.length) {
                    if (nums[even] % 2 == 0) {
                        nums[odd] = nums[odd] ^ nums[even];
                        nums[even] = nums[odd] ^ nums[even];
                        nums[odd] = nums[odd] ^ nums[even];
                        even++;
                        break;
                    } else {
                        even++;
                    }
                }
            }
        }
        return nums;
    }*/

}
