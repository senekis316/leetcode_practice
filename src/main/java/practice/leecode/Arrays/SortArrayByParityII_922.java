package practice.leecode.Arrays;

public class SortArrayByParityII_922 {

    public int[] sortArrayByParityII(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] % 2 == 1) {
                while(nums[j] % 2 == 1) {
                    j += 2;
                }
                nums[i] = nums[i] ^ nums[j];
                nums[j] = nums[i] ^ nums[j];
                nums[i] = nums[i] ^ nums[j];
            }
        }
        return nums;
    }

    /*public int[] sortArrayByParityII(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 && nums[i] % 2 != 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 0) {
                        nums[i] = nums[i] ^ nums[j];
                        nums[j] = nums[i] ^ nums[j];
                        nums[i] = nums[i] ^ nums[j];
                        break;
                    }
                }
            }
            if (i % 2 == 1 && nums[i] % 2 != 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 1) {
                        nums[i] = nums[i] ^ nums[j];
                        nums[j] = nums[i] ^ nums[j];
                        nums[i] = nums[i] ^ nums[j];
                        break;
                    }
                }
            }
        }
        return nums;
    }*/

}
