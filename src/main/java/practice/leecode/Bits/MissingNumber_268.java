package practice.leecode.Bits;

public class MissingNumber_268 {

    public int missingNumber(int[] nums) {
        int missingNumber = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missingNumber ^= nums[i] ^ i;
        }
        return missingNumber;
    }

}
