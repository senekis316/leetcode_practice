package practice.leecode.qq.MathAndNumber;

import java.util.Arrays;

public class SingleNumber {

    /*public int singleNumber(int[] nums) {

        if (nums.length==1) {
            return nums[0];
        }

        Arrays.sort(nums);

        if (nums[0]!=nums[1]) return nums[0];

        for(int i=1; i<nums.length-1; i++) {

            if (nums[i-1]!=nums[i] && nums[i]!=nums[i+1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }*/

    public int singleNumber(int[] nums) {
        int single = 0;
        for(int i = 0;i < nums.length; i++){
            single = single ^ nums[i];
        }
        return single;
    }

}
